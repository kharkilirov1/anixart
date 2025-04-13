package androidx.browser.browseractions;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.widget.TextViewCompat;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
class BrowserActionsFallbackMenuUi implements AdapterView.OnItemClickListener {

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$1 */
    class RunnableC01531 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$2 */
    class DialogInterfaceOnShowListenerC01542 implements DialogInterface.OnShowListener {
        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$3 */
    class ViewOnClickListenerC01553 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextViewCompat.m2640b(null) != Integer.MAX_VALUE) {
                throw null;
            }
            throw null;
        }
    }

    @RestrictTo
    @VisibleForTesting
    public interface BrowserActionsFallMenuUiListener {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        throw null;
    }
}
