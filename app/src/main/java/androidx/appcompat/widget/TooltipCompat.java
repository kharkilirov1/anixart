package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public class TooltipCompat {

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m999a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m998a(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m999a(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler = TooltipCompatHandler.f1657l;
        if (tooltipCompatHandler != null && tooltipCompatHandler.f1659b == view) {
            TooltipCompatHandler.m1000b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new TooltipCompatHandler(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler2 = TooltipCompatHandler.f1658m;
        if (tooltipCompatHandler2 != null && tooltipCompatHandler2.f1659b == view) {
            tooltipCompatHandler2.m1001a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
