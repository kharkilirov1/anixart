package androidx.browser.browseractions;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public final class BrowserServiceFileProvider extends FileProvider {

    /* renamed from: f */
    public static Object f1719f = new Object();

    /* renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$1 */
    class RunnableC01561 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ContentResolver f1720b;

        /* renamed from: c */
        public final /* synthetic */ Uri f1721c;

        /* renamed from: d */
        public final /* synthetic */ ResolvableFuture f1722d;

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f1720b.openFileDescriptor(this.f1721c, "r");
                if (openFileDescriptor == null) {
                    this.f1722d.mo1144i(new FileNotFoundException());
                    return;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
                if (decodeFileDescriptor == null) {
                    this.f1722d.mo1144i(new IOException("File could not be decoded."));
                } else {
                    this.f1722d.mo1143h(decodeFileDescriptor);
                }
            } catch (IOException e2) {
                this.f1722d.mo1144i(e2);
            }
        }
    }

    public static class FileCleanupTask extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        public static final long f1723b;

        /* renamed from: c */
        public static final long f1724c;

        /* renamed from: d */
        public static final long f1725d;

        /* renamed from: a */
        public final Context f1726a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f1723b = timeUnit.toMillis(7L);
            f1724c = timeUnit.toMillis(7L);
            f1725d = timeUnit.toMillis(1L);
        }

        public FileCleanupTask(Context context) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            SharedPreferences sharedPreferences = this.f1726a.getSharedPreferences(this.f1726a.getPackageName() + ".image_provider", 0);
            boolean z = true;
            if (!(System.currentTimeMillis() > sharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis()) + f1724c)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.f1719f) {
                File file = new File(this.f1726a.getFilesDir(), "image_provider");
                if (!file.exists()) {
                    return null;
                }
                File[] listFiles = file.listFiles();
                long currentTimeMillis = System.currentTimeMillis() - f1723b;
                for (File file2 : listFiles) {
                    if (file2.getName().endsWith("..png") && file2.lastModified() < currentTimeMillis && !file2.delete()) {
                        Log.e("BrowserServiceFP", "Fail to delete image: " + file2.getAbsoluteFile());
                        z = false;
                    }
                }
                long currentTimeMillis2 = z ? System.currentTimeMillis() : (System.currentTimeMillis() - f1724c) + f1725d;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_cleanup_time", currentTimeMillis2);
                edit.apply();
                return null;
            }
        }
    }

    public static class FileSaveTask extends AsyncTask<String, Void, Void> {
        @Override // android.os.AsyncTask
        public Void doInBackground(String[] strArr) {
            throw null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r3) {
            new FileCleanupTask(null).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }
}
