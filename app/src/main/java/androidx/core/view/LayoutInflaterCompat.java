package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class LayoutInflaterCompat {

    public static class Factory2Wrapper implements LayoutInflater.Factory2 {
        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            throw null;
        }

        @NonNull
        public String toString() {
            return getClass().getName() + "{" + ((Object) null) + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            throw null;
        }
    }
}
