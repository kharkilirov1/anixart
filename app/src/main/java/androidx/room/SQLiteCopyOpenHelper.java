package androidx.room;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.CopyLock;
import androidx.room.util.DBUtil;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import androidx.sqlite.p004db.framework.FrameworkSQLiteOpenHelperFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.Objects;
import java.util.concurrent.Callable;
import p000a.C0000a;

/* loaded from: classes.dex */
class SQLiteCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* renamed from: b */
    @NonNull
    public final Context f5878b;

    /* renamed from: c */
    @Nullable
    public final String f5879c;

    /* renamed from: d */
    @Nullable
    public final File f5880d;

    /* renamed from: e */
    @Nullable
    public final Callable<InputStream> f5881e;

    /* renamed from: f */
    public final int f5882f;

    /* renamed from: g */
    @NonNull
    public final SupportSQLiteOpenHelper f5883g;

    /* renamed from: h */
    @Nullable
    public DatabaseConfiguration f5884h;

    /* renamed from: i */
    public boolean f5885i;

    public SQLiteCopyOpenHelper(@NonNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i2, @NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        this.f5878b = context;
        this.f5879c = str;
        this.f5880d = file;
        this.f5881e = callable;
        this.f5882f = i2;
        this.f5883g = supportSQLiteOpenHelper;
    }

    /* renamed from: a */
    public final void m4089a(File file, boolean z) throws IOException {
        ReadableByteChannel newChannel;
        if (this.f5879c != null) {
            newChannel = Channels.newChannel(this.f5878b.getAssets().open(this.f5879c));
        } else if (this.f5880d != null) {
            newChannel = new FileInputStream(this.f5880d).getChannel();
        } else {
            Callable<InputStream> callable = this.f5881e;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel(callable.call());
            } catch (Exception e2) {
                throw new IOException("inputStreamCallable exception on call", e2);
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f5878b.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(newChannel);
                OutputStream newOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        newOutputStream.write(bArr, 0, read);
                    }
                }
            } else {
                channel.transferFrom(newChannel, 0L, Long.MAX_VALUE);
            }
            channel.force(false);
            newChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder m24u = C0000a.m24u("Failed to create directories for ");
                m24u.append(file.getAbsolutePath());
                throw new IOException(m24u.toString());
            }
            DatabaseConfiguration databaseConfiguration = this.f5884h;
            if (databaseConfiguration != null && databaseConfiguration.f5755f != null) {
                try {
                    int m4095b = DBUtil.m4095b(createTempFile);
                    FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
                    SupportSQLiteOpenHelper.Configuration.Builder builder = new SupportSQLiteOpenHelper.Configuration.Builder(this.f5878b);
                    builder.f6019b = createTempFile.getAbsolutePath();
                    builder.f6020c = new SupportSQLiteOpenHelper.Callback(this, Math.max(m4095b, 1)) { // from class: androidx.room.SQLiteCopyOpenHelper.1
                        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                        /* renamed from: c */
                        public void mo4078c(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                        }

                        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                        /* renamed from: e */
                        public void mo4080e(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                            int i2 = this.f6013a;
                            if (i2 < 1) {
                                supportSQLiteDatabase.mo4031H(i2);
                            }
                        }

                        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                        /* renamed from: f */
                        public void mo4081f(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) {
                        }
                    };
                    SupportSQLiteOpenHelper mo4052a = frameworkSQLiteOpenHelperFactory.mo4052a(builder.m4154a());
                    try {
                        if (z) {
                            mo4052a.getWritableDatabase();
                        } else {
                            mo4052a.getReadableDatabase();
                        }
                        Objects.requireNonNull(this.f5884h.f5755f);
                    } finally {
                        mo4052a.close();
                    }
                } catch (IOException e3) {
                    throw new RuntimeException("Malformed database file, unable to read version.", e3);
                }
            }
            if (createTempFile.renameTo(file)) {
                return;
            }
            StringBuilder m24u2 = C0000a.m24u("Failed to move intermediate file (");
            m24u2.append(createTempFile.getAbsolutePath());
            m24u2.append(") to destination (");
            m24u2.append(file.getAbsolutePath());
            m24u2.append(").");
            throw new IOException(m24u2.toString());
        } catch (Throwable th) {
            newChannel.close();
            channel.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m4090b(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.f5878b.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.f5884h;
        CopyLock copyLock = new CopyLock(databaseName, this.f5878b.getFilesDir(), databaseConfiguration == null || databaseConfiguration.f5762m);
        try {
            copyLock.f5920b.lock();
            if (copyLock.f5921c) {
                try {
                    FileChannel channel = new FileOutputStream(copyLock.f5919a).getChannel();
                    copyLock.f5922d = channel;
                    channel.lock();
                } catch (IOException e2) {
                    throw new IllegalStateException("Unable to grab copy lock.", e2);
                }
            }
            if (!databasePath.exists()) {
                try {
                    m4089a(databasePath, z);
                    copyLock.m4092a();
                    return;
                } catch (IOException e3) {
                    throw new RuntimeException("Unable to copy database file.", e3);
                }
            }
            if (this.f5884h == null) {
                copyLock.m4092a();
                return;
            }
            try {
                int m4095b = DBUtil.m4095b(databasePath);
                int i2 = this.f5882f;
                if (m4095b == i2) {
                    copyLock.m4092a();
                    return;
                }
                if (this.f5884h.m4053a(m4095b, i2)) {
                    copyLock.m4092a();
                    return;
                }
                if (this.f5878b.deleteDatabase(databaseName)) {
                    try {
                        m4089a(databasePath, z);
                    } catch (IOException e4) {
                        Log.w("ROOM", "Unable to copy database file.", e4);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                copyLock.m4092a();
                return;
            } catch (IOException e5) {
                Log.w("ROOM", "Unable to read database version.", e5);
                copyLock.m4092a();
                return;
            }
        } catch (Throwable th) {
            copyLock.m4092a();
            throw th;
        }
        copyLock.m4092a();
        throw th;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f5883g.close();
        this.f5885i = false;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.f5883g.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NonNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.f5883g;
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    public synchronized SupportSQLiteDatabase getReadableDatabase() {
        if (!this.f5885i) {
            m4090b(false);
            this.f5885i = true;
        }
        return this.f5883g.getReadableDatabase();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    public synchronized SupportSQLiteDatabase getWritableDatabase() {
        if (!this.f5885i) {
            m4090b(true);
            this.f5885i = true;
        }
        return this.f5883g.getWritableDatabase();
    }

    @Override // androidx.sqlite.p004db.SupportSQLiteOpenHelper
    @RequiresApi
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f5883g.setWriteAheadLoggingEnabled(z);
    }
}
