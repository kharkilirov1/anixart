package com.yandex.mobile.ads.exo.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.offline.DownloadRequest;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5239im;
import com.yandex.mobile.ads.impl.C5352kq;
import com.yandex.mobile.ads.impl.InterfaceC5292jm;
import com.yandex.mobile.ads.impl.InterfaceC5298jq;
import com.yandex.mobile.ads.impl.mb1;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.um1;
import com.yandex.mobile.ads.impl.w31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.exo.offline.a */
/* loaded from: classes2.dex */
public final class C4776a implements qj1 {

    /* renamed from: e */
    private static final String f48196e;

    /* renamed from: f */
    private static final String[] f48197f;

    /* renamed from: a */
    private final String f48198a;

    /* renamed from: b */
    private final InterfaceC5292jm f48199b;

    /* renamed from: c */
    private final Object f48200c;

    /* renamed from: d */
    @GuardedBy
    private boolean f48201d;

    /* renamed from: com.yandex.mobile.ads.exo.offline.a$a */
    public static final class a implements InterfaceC5298jq {

        /* renamed from: a */
        private final Cursor f48202a;

        public /* synthetic */ a(Cursor cursor, int i2) {
            this(cursor);
        }

        /* renamed from: a */
        public final C4777b m22290a() {
            return C4776a.m22280b(this.f48202a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f48202a.close();
        }

        public final int getPosition() {
            return this.f48202a.getPosition();
        }

        public final boolean moveToPosition(int i2) {
            return this.f48202a.moveToPosition(i2);
        }

        private a(Cursor cursor) {
            this.f48202a = cursor;
        }
    }

    static {
        int[] iArr = {3, 4};
        StringBuilder m27x = C0000a.m27x("state", " IN (");
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 > 0) {
                m27x.append(',');
            }
            m27x.append(iArr[i2]);
        }
        m27x.append(')');
        f48196e = m27x.toString();
        f48197f = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public C4776a(w31 w31Var) {
        this(w31Var, 0);
    }

    @Nullable
    /* renamed from: b */
    public final C4777b m22286b(String str) throws C5239im {
        m22278a();
        try {
            try {
                Cursor query = this.f48199b.getReadableDatabase().query(this.f48198a, f48197f, "id = ?", new String[]{str}, null, null, "start_time_ms ASC");
                try {
                    if (query.getCount() == 0) {
                        query.close();
                        return null;
                    }
                    query.moveToNext();
                    C4777b m22280b = m22280b(query);
                    query.close();
                    return m22280b;
                } finally {
                }
            } finally {
                C5239im c5239im = new C5239im(th);
            }
        } catch (SQLiteException th) {
            throw new C5239im(th);
        }
    }

    /* renamed from: c */
    public final void m22289c(String str) throws C5239im {
        m22278a();
        try {
            this.f48199b.getWritableDatabase().delete(this.f48198a, "id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    public C4776a(w31 w31Var, int i2) {
        this.f48199b = w31Var;
        this.f48198a = um1.m29049a("ExoPlayerDownloads", "");
        this.f48200c = new Object();
    }

    /* renamed from: a */
    public final InterfaceC5298jq m22282a(int... iArr) throws C5239im {
        String sb;
        m22278a();
        int i2 = 0;
        if (iArr.length == 0) {
            sb = "1";
        } else {
            StringBuilder m27x = C0000a.m27x("state", " IN (");
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (i3 > 0) {
                    m27x.append(',');
                }
                m27x.append(iArr[i3]);
            }
            m27x.append(')');
            sb = m27x.toString();
        }
        try {
            return new a(this.f48199b.getReadableDatabase().query(this.f48198a, f48197f, sb, null, null, null, "start_time_ms ASC"), i2);
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    /* renamed from: c */
    public final void m22288c() throws C5239im {
        m22278a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f48199b.getWritableDatabase().update(this.f48198a, contentValues, null, null);
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    /* renamed from: c */
    private static C4777b m22281c(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        Objects.requireNonNull(string);
        String string2 = cursor.getString(2);
        Objects.requireNonNull(string2);
        DownloadRequest.C4774b c4774b = new DownloadRequest.C4774b(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        DownloadRequest m22272a = c4774b.m22273b(str).m22270a(m22277a(cursor.getString(3))).m22269a(cursor.getString(4)).m22271a(cursor.getBlob(5)).m22272a();
        C5352kq c5352kq = new C5352kq();
        c5352kq.f52054a = cursor.getLong(13);
        c5352kq.f52055b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new C4777b(m22272a, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, c5352kq);
    }

    /* renamed from: b */
    public final void m22287b() throws C5239im {
        m22278a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f48199b.getWritableDatabase().update(this.f48198a, contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    /* renamed from: a */
    public final void m22285a(C4777b c4777b) throws C5239im {
        m22278a();
        try {
            m22279a(c4777b, this.f48199b.getWritableDatabase());
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C4777b m22280b(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        Objects.requireNonNull(string);
        String string2 = cursor.getString(2);
        Objects.requireNonNull(string2);
        DownloadRequest.C4774b m22270a = new DownloadRequest.C4774b(Uri.parse(string2), string).m22273b(cursor.getString(1)).m22270a(m22277a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest m22272a = m22270a.m22274b(blob).m22269a(cursor.getString(4)).m22271a(cursor.getBlob(5)).m22272a();
        C5352kq c5352kq = new C5352kq();
        c5352kq.f52054a = cursor.getLong(13);
        c5352kq.f52055b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new C4777b(m22272a, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, c5352kq);
    }

    /* renamed from: a */
    public final void m22283a(int i2) throws C5239im {
        m22278a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i2));
            this.f48199b.getWritableDatabase().update(this.f48198a, contentValues, f48196e, null);
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    /* renamed from: a */
    public final void m22284a(int i2, String str) throws C5239im {
        m22278a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i2));
            this.f48199b.getWritableDatabase().update(this.f48198a, contentValues, f48196e + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new C5239im(th);
        }
    }

    /* renamed from: a */
    private void m22278a() throws C5239im {
        synchronized (this.f48200c) {
            if (this.f48201d) {
                return;
            }
            try {
                int m26606a = mb1.m26606a(this.f48199b.getReadableDatabase(), 0, "");
                if (m26606a != 3) {
                    SQLiteDatabase writableDatabase = this.f48199b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        mb1.m26607a(writableDatabase, 0, "", 3);
                        ArrayList m22276a = m26606a == 2 ? m22276a(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f48198a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f48198a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = m22276a.iterator();
                        while (it.hasNext()) {
                            m22279a((C4777b) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f48201d = true;
            } catch (Throwable th2) {
                throw new C5239im(th2);
            }
        }
    }

    /* renamed from: a */
    private void m22279a(C4777b c4777b, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c4777b.f48203a.f48183e;
        if (bArr == null) {
            bArr = s91.f54535f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c4777b.f48203a.f48179a);
        contentValues.put("mime_type", c4777b.f48203a.f48181c);
        contentValues.put("uri", c4777b.f48203a.f48180b.toString());
        List<StreamKey> list = c4777b.f48203a.f48182d;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            StreamKey streamKey = list.get(i2);
            sb.append(streamKey.f48193a);
            sb.append('.');
            sb.append(streamKey.f48194b);
            sb.append('.');
            sb.append(streamKey.f48195c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", c4777b.f48203a.f48184f);
        contentValues.put("data", c4777b.f48203a.f48185g);
        contentValues.put("state", Integer.valueOf(c4777b.f48204b));
        contentValues.put("start_time_ms", Long.valueOf(c4777b.f48205c));
        contentValues.put("update_time_ms", Long.valueOf(c4777b.f48206d));
        contentValues.put("content_length", Long.valueOf(c4777b.f48207e));
        contentValues.put("stop_reason", Integer.valueOf(c4777b.f48208f));
        contentValues.put("failure_reason", Integer.valueOf(c4777b.f48209g));
        contentValues.put("percent_downloaded", Float.valueOf(c4777b.f48210h.f52055b));
        contentValues.put("bytes_downloaded", Long.valueOf(c4777b.f48210h.f52054a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f48198a, null, contentValues);
    }

    /* renamed from: a */
    private ArrayList m22276a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!s91.m28109a(sQLiteDatabase, this.f48198a)) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query(this.f48198a, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(m22281c(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: a */
    private static ArrayList m22277a(@Nullable String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i2 = s91.f54530a;
        for (String str2 : str.split(",", -1)) {
            String[] split = str2.split("\\.", -1);
            C5220ia.m25476b(split.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
        }
        return arrayList;
    }
}
