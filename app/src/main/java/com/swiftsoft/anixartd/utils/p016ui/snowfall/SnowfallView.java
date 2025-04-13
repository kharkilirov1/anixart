package com.swiftsoft.anixartd.utils.p016ui.snowfall;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.RunnableC0042c;
import androidx.core.graphics.drawable.DrawableKt;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.p016ui.snowfall.Snowflake;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnowfallView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/ui/snowfall/SnowfallView;", "Landroid/view/View;", "", "color", "", "setSnowflakeColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "UpdateSnowflakesThread", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SnowfallView extends View {

    /* renamed from: q */
    public static final /* synthetic */ int f30559q = 0;

    /* renamed from: b */
    public final int f30560b;

    /* renamed from: c */
    @Nullable
    public final Bitmap f30561c;

    /* renamed from: d */
    public int f30562d;

    /* renamed from: e */
    public final int f30563e;

    /* renamed from: f */
    public final int f30564f;

    /* renamed from: g */
    public final int f30565g;

    /* renamed from: h */
    public final int f30566h;

    /* renamed from: i */
    public final int f30567i;

    /* renamed from: j */
    public final float f30568j;

    /* renamed from: k */
    public final float f30569k;

    /* renamed from: l */
    public final boolean f30570l;

    /* renamed from: m */
    public final boolean f30571m;

    /* renamed from: n */
    public boolean f30572n;

    /* renamed from: o */
    public UpdateSnowflakesThread f30573o;

    /* renamed from: p */
    @Nullable
    public Snowflake[] f30574p;

    /* compiled from: SnowfallView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/ui/snowfall/SnowfallView$Companion;", "", "", "DEFAULT_SNOWFLAKES_ALREADY_FALLING", "Z", "DEFAULT_SNOWFLAKES_FADING_ENABLED", "", "DEFAULT_SNOWFLAKES_NUM", "I", "DEFAULT_SNOWFLAKES_SHOULD_RECYCLE_FALLING", "DEFAULT_SNOWFLAKE_ALPHA_MAX", "DEFAULT_SNOWFLAKE_ALPHA_MIN", "DEFAULT_SNOWFLAKE_ANGLE_MAX", "DEFAULT_SNOWFLAKE_COLOR", "DEFAULT_SNOWFLAKE_SIZE_MAX_IN_DP", "DEFAULT_SNOWFLAKE_SIZE_MIN_IN_DP", "", "DEFAULT_SNOWFLAKE_SPEED_MAX", "F", "DEFAULT_SNOWFLAKE_SPEED_MIN", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: SnowfallView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/ui/snowfall/SnowfallView$UpdateSnowflakesThread;", "Landroid/os/HandlerThread;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class UpdateSnowflakesThread extends HandlerThread {

        /* renamed from: b */
        @NotNull
        public final Handler f30575b;

        public UpdateSnowflakesThread() {
            super("SnowflakesComputations");
            start();
            this.f30575b = new Handler(getLooper());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnowfallView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
        new LinkedHashMap();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, C2507R.styleable.f25399e);
        Intrinsics.m32178g(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.SnowfallView)");
        try {
            this.f30560b = obtainStyledAttributes.getInt(11, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER);
            Drawable drawable = obtainStyledAttributes.getDrawable(4);
            this.f30561c = drawable != null ? DrawableKt.m1862a(drawable, 0, 0, null, 7) : null;
            this.f30562d = obtainStyledAttributes.getColor(3, -1);
            this.f30563e = obtainStyledAttributes.getInt(1, 150);
            this.f30564f = obtainStyledAttributes.getInt(0, 250);
            this.f30565g = obtainStyledAttributes.getInt(2, 10);
            this.f30566h = obtainStyledAttributes.getDimensionPixelSize(6, (int) (2 * getResources().getDisplayMetrics().density));
            this.f30567i = obtainStyledAttributes.getDimensionPixelSize(5, (int) (8 * getResources().getDisplayMetrics().density));
            this.f30568j = obtainStyledAttributes.getFloat(8, 2.0f);
            this.f30569k = obtainStyledAttributes.getFloat(7, 8.0f);
            this.f30570l = obtainStyledAttributes.getBoolean(10, false);
            this.f30571m = obtainStyledAttributes.getBoolean(9, false);
            this.f30572n = obtainStyledAttributes.getBoolean(12, true);
            setLayerType(2, null);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public final void m16475a() {
        this.f30572n = false;
        Snowflake[] snowflakeArr = this.f30574p;
        if (snowflakeArr != null) {
            for (Snowflake snowflake : snowflakeArr) {
                snowflake.f30586k = false;
            }
        }
    }

    /* renamed from: b */
    public final void m16476b() {
        UpdateSnowflakesThread updateSnowflakesThread = this.f30573o;
        if (updateSnowflakesThread != null) {
            updateSnowflakesThread.f30575b.post(new RunnableC0042c(this, 13));
        } else {
            Intrinsics.m32189r("updateSnowflakesThread");
            throw null;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30573o = new UpdateSnowflakesThread();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        UpdateSnowflakesThread updateSnowflakesThread = this.f30573o;
        if (updateSnowflakesThread == null) {
            Intrinsics.m32189r("updateSnowflakesThread");
            throw null;
        }
        updateSnowflakesThread.quit();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        boolean z;
        ArrayList arrayList;
        Intrinsics.m32179h(canvas, "canvas");
        super.onDraw(canvas);
        if (isInEditMode()) {
            return;
        }
        Snowflake[] snowflakeArr = this.f30574p;
        boolean z2 = false;
        if (snowflakeArr != null) {
            Iterator m32154a = ArrayIteratorKt.m32154a(snowflakeArr);
            z = false;
            while (m32154a.hasNext()) {
                Snowflake snowflake = (Snowflake) m32154a.next();
                if (snowflake.m16480c()) {
                    snowflake.m16478a(canvas);
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            m16476b();
        } else {
            setVisibility(8);
        }
        Snowflake[] snowflakeArr2 = this.f30574p;
        if (snowflakeArr2 != null) {
            arrayList = new ArrayList();
            for (Snowflake snowflake2 : snowflakeArr2) {
                if (snowflake2.m16480c()) {
                    arrayList.add(snowflake2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && (!arrayList.isEmpty())) {
            z2 = true;
        }
        if (!z2) {
            setVisibility(8);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Snowflake) it.next()).m16478a(canvas);
        }
        m16476b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Randomizer randomizer = new Randomizer();
        Snowflake.Params params = new Snowflake.Params(getWidth(), getHeight(), this.f30561c, this.f30562d, this.f30563e, this.f30564f, this.f30565g, this.f30566h, this.f30567i, this.f30568j, this.f30569k, this.f30570l, this.f30571m, this.f30572n);
        int i6 = this.f30560b;
        Snowflake[] snowflakeArr = new Snowflake[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            snowflakeArr[i7] = new Snowflake(randomizer, params);
        }
        this.f30574p = snowflakeArr;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i2) {
        Snowflake[] snowflakeArr;
        Intrinsics.m32179h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i2);
        if (changedView == this && i2 == 8 && (snowflakeArr = this.f30574p) != null) {
            for (Snowflake snowflake : snowflakeArr) {
                snowflake.m16481d(null);
            }
        }
    }

    public final void setSnowflakeColor(int color) {
        this.f30562d = color;
    }
}
