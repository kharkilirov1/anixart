package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.network.NetworkFetcher;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import javax.net.ssl.SSLException;
import p000a.C0000a;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: v */
    public static final LottieListener<Throwable> f7111v = new LottieListener<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.1
        @Override // com.airbnb.lottie.LottieListener
        public void onResult(Throwable th) {
            Throwable th2 = th;
            PathMeasure pathMeasure = Utils.f7847a;
            if (!((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                throw new IllegalStateException("Unable to parse composition", th2);
            }
            Logger.m4834b("Unable to load composition.", th2);
        }
    };

    /* renamed from: e */
    public final LottieListener<LottieComposition> f7112e;

    /* renamed from: f */
    public final LottieListener<Throwable> f7113f;

    /* renamed from: g */
    @Nullable
    public LottieListener<Throwable> f7114g;

    /* renamed from: h */
    @DrawableRes
    public int f7115h;

    /* renamed from: i */
    public final LottieDrawable f7116i;

    /* renamed from: j */
    public boolean f7117j;

    /* renamed from: k */
    public String f7118k;

    /* renamed from: l */
    @RawRes
    public int f7119l;

    /* renamed from: m */
    public boolean f7120m;

    /* renamed from: n */
    public boolean f7121n;

    /* renamed from: o */
    public boolean f7122o;

    /* renamed from: p */
    public boolean f7123p;

    /* renamed from: q */
    public RenderMode f7124q;

    /* renamed from: r */
    public Set<LottieOnCompositionLoadedListener> f7125r;

    /* renamed from: s */
    public int f7126s;

    /* renamed from: t */
    @Nullable
    public LottieTask<LottieComposition> f7127t;

    /* renamed from: u */
    @Nullable
    public LottieComposition f7128u;

    /* renamed from: com.airbnb.lottie.LottieAnimationView$4 */
    class C07244 extends LottieValueCallback<Object> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        /* renamed from: a */
        public Object mo4645a(LottieFrameInfo<Object> lottieFrameInfo) {
            throw null;
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$5 */
    public static /* synthetic */ class C07255 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7131a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f7131a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7131a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7131a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public String f7132b;

        /* renamed from: c */
        public int f7133c;

        /* renamed from: d */
        public float f7134d;

        /* renamed from: e */
        public boolean f7135e;

        /* renamed from: f */
        public String f7136f;

        /* renamed from: g */
        public int f7137g;

        /* renamed from: h */
        public int f7138h;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f7132b);
            parcel.writeFloat(this.f7134d);
            parcel.writeInt(this.f7135e ? 1 : 0);
            parcel.writeString(this.f7136f);
            parcel.writeInt(this.f7137g);
            parcel.writeInt(this.f7138h);
        }

        public SavedState(Parcel parcel, C07211 c07211) {
            super(parcel);
            this.f7132b = parcel.readString();
            this.f7134d = parcel.readFloat();
            this.f7135e = parcel.readInt() == 1;
            this.f7136f = parcel.readString();
            this.f7137g = parcel.readInt();
            this.f7138h = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.f7112e = new LottieListener<LottieComposition>() { // from class: com.airbnb.lottie.LottieAnimationView.2
            @Override // com.airbnb.lottie.LottieListener
            public void onResult(LottieComposition lottieComposition) {
                LottieAnimationView.this.setComposition(lottieComposition);
            }
        };
        this.f7113f = new LottieListener<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.3
            @Override // com.airbnb.lottie.LottieListener
            public void onResult(Throwable th) {
                Throwable th2 = th;
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                int i2 = lottieAnimationView.f7115h;
                if (i2 != 0) {
                    lottieAnimationView.setImageResource(i2);
                }
                LottieListener<Throwable> lottieListener = LottieAnimationView.this.f7114g;
                if (lottieListener == null) {
                    LottieListener<Throwable> lottieListener2 = LottieAnimationView.f7111v;
                    lottieListener = LottieAnimationView.f7111v;
                }
                lottieListener.onResult(th2);
            }
        };
        this.f7115h = 0;
        LottieDrawable lottieDrawable = new LottieDrawable();
        this.f7116i = lottieDrawable;
        this.f7120m = false;
        this.f7121n = false;
        this.f7122o = false;
        this.f7123p = true;
        this.f7124q = RenderMode.AUTOMATIC;
        this.f7125r = new HashSet();
        this.f7126s = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0758R.styleable.f7271a);
        if (!isInEditMode()) {
            this.f7123p = obtainStyledAttributes.getBoolean(1, true);
            boolean hasValue = obtainStyledAttributes.hasValue(9);
            boolean hasValue2 = obtainStyledAttributes.hasValue(5);
            boolean hasValue3 = obtainStyledAttributes.hasValue(15);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(9, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(15)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f7121n = true;
            this.f7122o = true;
        }
        if (obtainStyledAttributes.getBoolean(7, false)) {
            lottieDrawable.f7170d.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatMode(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatCount(obtainStyledAttributes.getInt(11, -1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setSpeed(obtainStyledAttributes.getFloat(14, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(6));
        setProgress(obtainStyledAttributes.getFloat(8, 0.0f));
        boolean z = obtainStyledAttributes.getBoolean(3, false);
        if (lottieDrawable.f7182p != z) {
            lottieDrawable.f7182p = z;
            if (lottieDrawable.f7169c != null) {
                lottieDrawable.m4660b();
            }
        }
        if (obtainStyledAttributes.hasValue(2)) {
            lottieDrawable.m4659a(new KeyPath("**"), LottieProperty.f7231C, new LottieValueCallback(new SimpleColorFilter(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            lottieDrawable.f7171e = obtainStyledAttributes.getFloat(13, 1.0f);
            lottieDrawable.m4680v();
        }
        if (obtainStyledAttributes.hasValue(10)) {
            int i2 = obtainStyledAttributes.getInt(10, 0);
            setRenderMode(RenderMode.values()[i2 >= RenderMode.values().length ? 0 : i2]);
        }
        if (getScaleType() != null) {
            lottieDrawable.f7175i = getScaleType();
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        PathMeasure pathMeasure = Utils.f7847a;
        Boolean valueOf = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f);
        Objects.requireNonNull(lottieDrawable);
        lottieDrawable.f7172f = valueOf.booleanValue();
        m4642i();
        this.f7117j = true;
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        this.f7128u = null;
        this.f7116i.m4661c();
        m4641g();
        lottieTask.m4685b(this.f7112e);
        lottieTask.m4684a(this.f7113f);
        this.f7127t = lottieTask;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        this.f7126s++;
        super.buildDrawingCache(z);
        if (this.f7126s == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f7126s--;
        C0720L.m4640a("buildDrawingCache");
    }

    /* renamed from: g */
    public final void m4641g() {
        LottieTask<LottieComposition> lottieTask = this.f7127t;
        if (lottieTask != null) {
            LottieListener<LottieComposition> lottieListener = this.f7112e;
            synchronized (lottieTask) {
                lottieTask.f7262a.remove(lottieListener);
            }
            LottieTask<LottieComposition> lottieTask2 = this.f7127t;
            LottieListener<Throwable> lottieListener2 = this.f7113f;
            synchronized (lottieTask2) {
                lottieTask2.f7263b.remove(lottieListener2);
            }
        }
    }

    @Nullable
    public LottieComposition getComposition() {
        return this.f7128u;
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.f7128u;
        if (lottieComposition != null) {
            return (long) lottieComposition.m4647b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f7116i.f7170d.f7838g;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f7116i.f7177k;
    }

    public float getMaxFrame() {
        return this.f7116i.m4663e();
    }

    public float getMinFrame() {
        return this.f7116i.m4664f();
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.f7116i.f7169c;
        if (lottieComposition != null) {
            return lottieComposition.f7139a;
        }
        return null;
    }

    @FloatRange
    public float getProgress() {
        return this.f7116i.m4665g();
    }

    public int getRepeatCount() {
        return this.f7116i.m4666h();
    }

    public int getRepeatMode() {
        return this.f7116i.f7170d.getRepeatMode();
    }

    public float getScale() {
        return this.f7116i.f7171e;
    }

    public float getSpeed() {
        return this.f7116i.f7170d.f7835d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r0 != 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        r1 = 1;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4642i() {
        /*
            r6 = this;
            com.airbnb.lottie.RenderMode r0 = r6.f7124q
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto Le
            if (r0 == r2) goto L29
        Lc:
            r1 = 1
            goto L29
        Le:
            com.airbnb.lottie.LottieComposition r0 = r6.f7128u
            r3 = 0
            if (r0 == 0) goto L1e
            boolean r4 = r0.f7152n
            if (r4 == 0) goto L1e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L1e
            goto L27
        L1e:
            if (r0 == 0) goto L26
            int r0 = r0.f7153o
            r4 = 4
            if (r0 <= r4) goto L26
            goto L27
        L26:
            r3 = 1
        L27:
            if (r3 == 0) goto Lc
        L29:
            int r0 = r6.getLayerType()
            if (r1 == r0) goto L33
            r0 = 0
            r6.setLayerType(r1, r0)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.m4642i():void");
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f7116i;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @MainThread
    /* renamed from: j */
    public void m4643j() {
        this.f7122o = false;
        this.f7121n = false;
        this.f7120m = false;
        LottieDrawable lottieDrawable = this.f7116i;
        lottieDrawable.f7174h.clear();
        lottieDrawable.f7170d.m4841i();
        m4642i();
    }

    @MainThread
    /* renamed from: k */
    public void m4644k() {
        if (!isShown()) {
            this.f7120m = true;
        } else {
            this.f7116i.m4668j();
            m4642i();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7122o || this.f7121n) {
            m4644k();
            this.f7122o = false;
            this.f7121n = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (this.f7116i.m4667i()) {
            this.f7120m = false;
            LottieDrawable lottieDrawable = this.f7116i;
            lottieDrawable.f7174h.clear();
            lottieDrawable.f7170d.cancel();
            m4642i();
            this.f7121n = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f7132b;
        this.f7118k = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f7118k);
        }
        int i2 = savedState.f7133c;
        this.f7119l = i2;
        if (i2 != 0) {
            setAnimation(i2);
        }
        setProgress(savedState.f7134d);
        if (savedState.f7135e) {
            m4644k();
        }
        this.f7116i.f7177k = savedState.f7136f;
        setRepeatMode(savedState.f7137g);
        setRepeatCount(savedState.f7138h);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7132b = this.f7118k;
        savedState.f7133c = this.f7119l;
        savedState.f7134d = this.f7116i.m4665g();
        savedState.f7135e = this.f7116i.m4667i() || (!ViewCompat.m2173M(this) && this.f7121n);
        LottieDrawable lottieDrawable = this.f7116i;
        savedState.f7136f = lottieDrawable.f7177k;
        savedState.f7137g = lottieDrawable.f7170d.getRepeatMode();
        savedState.f7138h = this.f7116i.m4666h();
        return savedState;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
        if (this.f7117j) {
            if (!isShown()) {
                if (this.f7116i.m4667i()) {
                    m4643j();
                    this.f7120m = true;
                    return;
                }
                return;
            }
            if (this.f7120m) {
                if (isShown()) {
                    this.f7116i.m4669k();
                    m4642i();
                } else {
                    this.f7120m = true;
                }
                this.f7120m = false;
            }
        }
    }

    public void setAnimation(@RawRes final int i2) {
        LottieTask<LottieComposition> m4651a;
        this.f7119l = i2;
        this.f7118k = null;
        if (this.f7123p) {
            Context context = getContext();
            String m4658h = LottieCompositionFactory.m4658h(context, i2);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            m4651a = LottieCompositionFactory.m4651a(m4658h, new Callable<LottieResult<LottieComposition>>() { // from class: com.airbnb.lottie.LottieCompositionFactory.3

                /* renamed from: b */
                public final /* synthetic */ WeakReference f7162b;

                /* renamed from: c */
                public final /* synthetic */ Context f7163c;

                /* renamed from: d */
                public final /* synthetic */ int f7164d;

                public CallableC07323(final WeakReference weakReference2, final Context applicationContext2, final int i22) {
                    r1 = weakReference2;
                    r2 = applicationContext2;
                    r3 = i22;
                }

                @Override // java.util.concurrent.Callable
                public LottieResult<LottieComposition> call() throws Exception {
                    Context context2 = (Context) r1.get();
                    if (context2 == null) {
                        context2 = r2;
                    }
                    int i3 = r3;
                    try {
                        return LottieCompositionFactory.m4652b(context2.getResources().openRawResource(i3), LottieCompositionFactory.m4658h(context2, i3));
                    } catch (Resources.NotFoundException e2) {
                        return new LottieResult<>((Throwable) e2);
                    }
                }
            });
        } else {
            Context context2 = getContext();
            Map<String, LottieTask<LottieComposition>> map = LottieCompositionFactory.f7154a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            m4651a = LottieCompositionFactory.m4651a(null, new Callable<LottieResult<LottieComposition>>() { // from class: com.airbnb.lottie.LottieCompositionFactory.3

                /* renamed from: b */
                public final /* synthetic */ WeakReference f7162b;

                /* renamed from: c */
                public final /* synthetic */ Context f7163c;

                /* renamed from: d */
                public final /* synthetic */ int f7164d;

                public CallableC07323(final WeakReference weakReference22, final Context applicationContext22, final int i22) {
                    r1 = weakReference22;
                    r2 = applicationContext22;
                    r3 = i22;
                }

                @Override // java.util.concurrent.Callable
                public LottieResult<LottieComposition> call() throws Exception {
                    Context context22 = (Context) r1.get();
                    if (context22 == null) {
                        context22 = r2;
                    }
                    int i3 = r3;
                    try {
                        return LottieCompositionFactory.m4652b(context22.getResources().openRawResource(i3), LottieCompositionFactory.m4658h(context22, i3));
                    } catch (Resources.NotFoundException e2) {
                        return new LottieResult<>((Throwable) e2);
                    }
                }
            });
        }
        setCompositionTask(m4651a);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        Map<String, LottieTask<LottieComposition>> map = LottieCompositionFactory.f7154a;
        final String str2 = null;
        setCompositionTask(LottieCompositionFactory.m4651a(null, new Callable<LottieResult<LottieComposition>>() { // from class: com.airbnb.lottie.LottieCompositionFactory.4

            /* renamed from: b */
            public final /* synthetic */ InputStream f7165b;

            /* renamed from: c */
            public final /* synthetic */ String f7166c;

            public CallableC07334(final InputStream byteArrayInputStream2, final String str22) {
                r1 = byteArrayInputStream2;
                r2 = str22;
            }

            @Override // java.util.concurrent.Callable
            public LottieResult<LottieComposition> call() throws Exception {
                return LottieCompositionFactory.m4652b(r1, r2);
            }
        }));
    }

    public void setAnimationFromUrl(final String str) {
        LottieTask<LottieComposition> m4651a;
        if (this.f7123p) {
            final Context context = getContext();
            Map<String, LottieTask<LottieComposition>> map = LottieCompositionFactory.f7154a;
            m4651a = LottieCompositionFactory.m4651a(C0000a.m14k("url_", str), new Callable<LottieResult<LottieComposition>>() { // from class: com.airbnb.lottie.LottieCompositionFactory.1

                /* renamed from: b */
                public final /* synthetic */ Context f7155b;

                /* renamed from: c */
                public final /* synthetic */ String f7156c;

                public CallableC07281(final Context context2, final String str2) {
                    r1 = context2;
                    r2 = str2;
                }

                @Override // java.util.concurrent.Callable
                public LottieResult<LottieComposition> call() throws Exception {
                    return NetworkFetcher.m4762b(r1, r2);
                }
            });
        } else {
            final Context context2 = getContext();
            Map<String, LottieTask<LottieComposition>> map2 = LottieCompositionFactory.f7154a;
            m4651a = LottieCompositionFactory.m4651a(null, new Callable<LottieResult<LottieComposition>>() { // from class: com.airbnb.lottie.LottieCompositionFactory.1

                /* renamed from: b */
                public final /* synthetic */ Context f7155b;

                /* renamed from: c */
                public final /* synthetic */ String f7156c;

                public CallableC07281(final Context context22, final String str2) {
                    r1 = context22;
                    r2 = str2;
                }

                @Override // java.util.concurrent.Callable
                public LottieResult<LottieComposition> call() throws Exception {
                    return NetworkFetcher.m4762b(r1, r2);
                }
            });
        }
        setCompositionTask(m4651a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f7116i.f7186t = z;
    }

    public void setCacheComposition(boolean z) {
        this.f7123p = z;
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        this.f7116i.setCallback(this);
        this.f7128u = lottieComposition;
        LottieDrawable lottieDrawable = this.f7116i;
        if (lottieDrawable.f7169c != lottieComposition) {
            lottieDrawable.f7188v = false;
            lottieDrawable.m4661c();
            lottieDrawable.f7169c = lottieComposition;
            lottieDrawable.m4660b();
            LottieValueAnimator lottieValueAnimator = lottieDrawable.f7170d;
            r2 = lottieValueAnimator.f7842k == null;
            lottieValueAnimator.f7842k = lottieComposition;
            if (r2) {
                lottieValueAnimator.m4843k((int) Math.max(lottieValueAnimator.f7840i, lottieComposition.f7149k), (int) Math.min(lottieValueAnimator.f7841j, lottieComposition.f7150l));
            } else {
                lottieValueAnimator.m4843k((int) lottieComposition.f7149k, (int) lottieComposition.f7150l);
            }
            float f2 = lottieValueAnimator.f7838g;
            lottieValueAnimator.f7838g = 0.0f;
            lottieValueAnimator.m4842j((int) f2);
            lottieDrawable.m4679u(lottieDrawable.f7170d.getAnimatedFraction());
            lottieDrawable.f7171e = lottieDrawable.f7171e;
            lottieDrawable.m4680v();
            lottieDrawable.m4680v();
            Iterator it = new ArrayList(lottieDrawable.f7174h).iterator();
            while (it.hasNext()) {
                ((LottieDrawable.LazyCompositionTask) it.next()).mo4682a(lottieComposition);
                it.remove();
            }
            lottieDrawable.f7174h.clear();
            lottieComposition.f7139a.f7268a = lottieDrawable.f7185s;
            r2 = true;
        }
        m4642i();
        if (getDrawable() != this.f7116i || r2) {
            setImageDrawable(null);
            setImageDrawable(this.f7116i);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<LottieOnCompositionLoadedListener> it2 = this.f7125r.iterator();
            while (it2.hasNext()) {
                it2.next().m4683a(lottieComposition);
            }
        }
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.f7114g = lottieListener;
    }

    public void setFallbackResource(@DrawableRes int i2) {
        this.f7115h = i2;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        LottieDrawable lottieDrawable = this.f7116i;
        lottieDrawable.f7180n = fontAssetDelegate;
        FontAssetManager fontAssetManager = lottieDrawable.f7179m;
        if (fontAssetManager != null) {
            fontAssetManager.f7460e = fontAssetDelegate;
        }
    }

    public void setFrame(int i2) {
        this.f7116i.m4670l(i2);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        LottieDrawable lottieDrawable = this.f7116i;
        lottieDrawable.f7178l = imageAssetDelegate;
        ImageAssetManager imageAssetManager = lottieDrawable.f7176j;
        if (imageAssetManager != null) {
            imageAssetManager.f7465c = imageAssetDelegate;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f7116i.f7177k = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m4641g();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m4641g();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        m4641g();
        super.setImageResource(i2);
    }

    public void setMaxFrame(int i2) {
        this.f7116i.m4671m(i2);
    }

    public void setMaxProgress(@FloatRange float f2) {
        this.f7116i.m4673o(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.f7116i.m4675q(str);
    }

    public void setMinFrame(int i2) {
        this.f7116i.m4676r(i2);
    }

    public void setMinProgress(float f2) {
        this.f7116i.m4678t(f2);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.f7116i;
        lottieDrawable.f7185s = z;
        LottieComposition lottieComposition = lottieDrawable.f7169c;
        if (lottieComposition != null) {
            lottieComposition.f7139a.f7268a = z;
        }
    }

    public void setProgress(@FloatRange float f2) {
        this.f7116i.m4679u(f2);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f7124q = renderMode;
        m4642i();
    }

    public void setRepeatCount(int i2) {
        this.f7116i.f7170d.setRepeatCount(i2);
    }

    public void setRepeatMode(int i2) {
        this.f7116i.f7170d.setRepeatMode(i2);
    }

    public void setSafeMode(boolean z) {
        this.f7116i.f7173g = z;
    }

    public void setScale(float f2) {
        LottieDrawable lottieDrawable = this.f7116i;
        lottieDrawable.f7171e = f2;
        lottieDrawable.m4680v();
        if (getDrawable() == this.f7116i) {
            setImageDrawable(null);
            setImageDrawable(this.f7116i);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        LottieDrawable lottieDrawable = this.f7116i;
        if (lottieDrawable != null) {
            lottieDrawable.f7175i = scaleType;
        }
    }

    public void setSpeed(float f2) {
        this.f7116i.f7170d.f7835d = f2;
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.f7116i.f7181o = textDelegate;
    }

    public void setMaxFrame(String str) {
        this.f7116i.m4672n(str);
    }

    public void setMinFrame(String str) {
        this.f7116i.m4677s(str);
    }

    public void setAnimation(final String str) {
        LottieTask<LottieComposition> m4651a;
        this.f7118k = str;
        this.f7119l = 0;
        if (this.f7123p) {
            Context context = getContext();
            Map<String, LottieTask<LottieComposition>> map = LottieCompositionFactory.f7154a;
            final String m14k = C0000a.m14k("asset_", str);
            final Context applicationContext = context.getApplicationContext();
            m4651a = LottieCompositionFactory.m4651a(m14k, new Callable<LottieResult<LottieComposition>>() { // from class: com.airbnb.lottie.LottieCompositionFactory.2

                /* renamed from: b */
                public final /* synthetic */ Context f7159b;

                /* renamed from: c */
                public final /* synthetic */ String f7160c;

                /* renamed from: d */
                public final /* synthetic */ String f7161d;

                public CallableC07312(final Context applicationContext2, final String str2, final String m14k2) {
                    r1 = applicationContext2;
                    r2 = str2;
                    r3 = m14k2;
                }

                @Override // java.util.concurrent.Callable
                public LottieResult<LottieComposition> call() throws Exception {
                    Context context2 = r1;
                    String str2 = r2;
                    String str3 = r3;
                    Map<String, LottieTask<LottieComposition>> map2 = LottieCompositionFactory.f7154a;
                    try {
                        return str2.endsWith(".zip") ? LottieCompositionFactory.m4656f(new ZipInputStream(context2.getAssets().open(str2)), str3) : LottieCompositionFactory.m4652b(context2.getAssets().open(str2), str3);
                    } catch (IOException e2) {
                        return new LottieResult<>((Throwable) e2);
                    }
                }
            });
        } else {
            Context context2 = getContext();
            final String str2 = null;
            Map<String, LottieTask<LottieComposition>> map2 = LottieCompositionFactory.f7154a;
            final Context applicationContext2 = context2.getApplicationContext();
            m4651a = LottieCompositionFactory.m4651a(null, new Callable<LottieResult<LottieComposition>>() { // from class: com.airbnb.lottie.LottieCompositionFactory.2

                /* renamed from: b */
                public final /* synthetic */ Context f7159b;

                /* renamed from: c */
                public final /* synthetic */ String f7160c;

                /* renamed from: d */
                public final /* synthetic */ String f7161d;

                public CallableC07312(final Context applicationContext22, final String str22, final String str23) {
                    r1 = applicationContext22;
                    r2 = str22;
                    r3 = str23;
                }

                @Override // java.util.concurrent.Callable
                public LottieResult<LottieComposition> call() throws Exception {
                    Context context22 = r1;
                    String str22 = r2;
                    String str3 = r3;
                    Map<String, LottieTask<LottieComposition>> map22 = LottieCompositionFactory.f7154a;
                    try {
                        return str22.endsWith(".zip") ? LottieCompositionFactory.m4656f(new ZipInputStream(context22.getAssets().open(str22)), str3) : LottieCompositionFactory.m4652b(context22.getAssets().open(str22), str3);
                    } catch (IOException e2) {
                        return new LottieResult<>((Throwable) e2);
                    }
                }
            });
        }
        setCompositionTask(m4651a);
    }
}
