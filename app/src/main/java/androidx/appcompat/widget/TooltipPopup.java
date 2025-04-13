package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
class TooltipPopup {

    /* renamed from: a */
    public final Context f1669a;

    /* renamed from: b */
    public final View f1670b;

    /* renamed from: c */
    public final TextView f1671c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f1672d;

    /* renamed from: e */
    public final Rect f1673e;

    /* renamed from: f */
    public final int[] f1674f;

    /* renamed from: g */
    public final int[] f1675g;

    public TooltipPopup(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1672d = layoutParams;
        this.f1673e = new Rect();
        this.f1674f = new int[2];
        this.f1675g = new int[2];
        this.f1669a = context;
        View inflate = LayoutInflater.from(context).inflate(C2507R.layout.abc_tooltip, (ViewGroup) null);
        this.f1670b = inflate;
        this.f1671c = (TextView) inflate.findViewById(C2507R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017156;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    public void m1003a() {
        if (this.f1670b.getParent() != null) {
            ((WindowManager) this.f1669a.getSystemService("window")).removeView(this.f1670b);
        }
    }
}
