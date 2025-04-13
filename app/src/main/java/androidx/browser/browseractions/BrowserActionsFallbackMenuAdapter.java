package androidx.browser.browseractions;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes.dex */
class BrowserActionsFallbackMenuAdapter extends BaseAdapter {

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$1 */
    public class RunnableC01501 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f1710b;

        /* renamed from: c */
        public final /* synthetic */ ViewHolderItem f1711c;

        /* renamed from: d */
        public final /* synthetic */ ListenableFuture f1712d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.f1710b, this.f1711c.f1714b.getText())) {
                try {
                    bitmap = (Bitmap) this.f1712d.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.f1711c.f1713a.setVisibility(0);
                    this.f1711c.f1713a.setImageBitmap(bitmap);
                } else {
                    this.f1711c.f1713a.setVisibility(4);
                    this.f1711c.f1713a.setImageBitmap(null);
                }
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$2 */
    public class ExecutorC01512 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    public static class ViewHolderItem {

        /* renamed from: a */
        public final ImageView f1713a;

        /* renamed from: b */
        public final TextView f1714b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        throw null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        throw null;
    }
}
