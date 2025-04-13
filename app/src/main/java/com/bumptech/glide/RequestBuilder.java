package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Executors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> implements ModelTypes<RequestBuilder<TranscodeType>> {

    /* renamed from: B */
    public final Context f7934B;

    /* renamed from: C */
    public final RequestManager f7935C;

    /* renamed from: D */
    public final Class<TranscodeType> f7936D;

    /* renamed from: E */
    public final GlideContext f7937E;

    /* renamed from: F */
    @NonNull
    public TransitionOptions<?, ? super TranscodeType> f7938F;

    /* renamed from: G */
    @Nullable
    public Object f7939G;

    /* renamed from: H */
    @Nullable
    public List<RequestListener<TranscodeType>> f7940H;

    /* renamed from: I */
    public boolean f7941I;

    /* renamed from: com.bumptech.glide.RequestBuilder$1 */
    public static /* synthetic */ class C07791 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7942a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7943b;

        static {
            int[] iArr = new int[Priority.values().length];
            f7943b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7943b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7943b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7943b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f7942a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7942a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7942a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7942a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7942a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7942a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7942a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7942a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new RequestOptions().mo5257f(DiskCacheStrategy.f8204b).mo5267q(Priority.LOW).mo5271u(true);
    }

    @SuppressLint
    public RequestBuilder(@NonNull Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        RequestOptions requestOptions;
        this.f7935C = requestManager;
        this.f7936D = cls;
        this.f7934B = context;
        GlideContext glideContext = requestManager.f7945b.f7883d;
        TransitionOptions transitionOptions = glideContext.f7909f.get(cls);
        if (transitionOptions == null) {
            for (Map.Entry<Class<?>, TransitionOptions<?, ?>> entry : glideContext.f7909f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transitionOptions = (TransitionOptions) entry.getValue();
                }
            }
        }
        this.f7938F = transitionOptions == null ? GlideContext.f7903j : transitionOptions;
        this.f7937E = glide.f7883d;
        Iterator<RequestListener<Object>> it = requestManager.f7954k.iterator();
        while (it.hasNext()) {
            mo4881E((RequestListener) it.next());
        }
        synchronized (requestManager) {
            requestOptions = requestManager.f7955l;
        }
        mo4892a(requestOptions);
    }

    @NonNull
    @CheckResult
    /* renamed from: E */
    public RequestBuilder<TranscodeType> mo4881E(@Nullable RequestListener<TranscodeType> requestListener) {
        if (requestListener != null) {
            if (this.f7940H == null) {
                this.f7940H = new ArrayList();
            }
            this.f7940H.add(requestListener);
        }
        return this;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4892a(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        Objects.requireNonNull(baseRequestOptions, "Argument must not be null");
        return (RequestBuilder) super.mo4892a(baseRequestOptions);
    }

    /* renamed from: G */
    public final Request m4883G(Target<TranscodeType> target, @Nullable RequestListener<TranscodeType> requestListener, @Nullable RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i2, int i3, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        return m4890N(target, requestListener, baseRequestOptions, null, transitionOptions, priority, i2, i3, executor);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> clone() {
        RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.clone();
        requestBuilder.f7938F = (TransitionOptions<?, ? super TranscodeType>) requestBuilder.f7938F.m4906a();
        return requestBuilder;
    }

    @NonNull
    /* renamed from: I */
    public <Y extends Target<TranscodeType>> Y m4885I(@NonNull Y y) {
        m4886J(y, null, this, Executors.f8839a);
        return y;
    }

    /* renamed from: J */
    public final <Y extends Target<TranscodeType>> Y m4886J(@NonNull Y y, @Nullable RequestListener<TranscodeType> requestListener, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        Objects.requireNonNull(y, "Argument must not be null");
        if (!this.f7941I) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Request m4883G = m4883G(y, requestListener, null, this.f7938F, baseRequestOptions.f8709e, baseRequestOptions.f8716l, baseRequestOptions.f8715k, baseRequestOptions, executor);
        Request mo5295j = y.mo5295j();
        SingleRequest singleRequest = (SingleRequest) m4883G;
        if (singleRequest.m5306n(mo5295j)) {
            if (!(!baseRequestOptions.f8714j && mo5295j.mo5287k())) {
                singleRequest.mo5279c();
                Objects.requireNonNull(mo5295j, "Argument must not be null");
                if (!mo5295j.isRunning()) {
                    mo5295j.mo5285i();
                }
                return y;
            }
        }
        this.f7935C.m4899n(y);
        y.mo5290d(m4883G);
        RequestManager requestManager = this.f7935C;
        synchronized (requestManager) {
            requestManager.f7950g.f8687b.add(y);
            RequestTracker requestTracker = requestManager.f7948e;
            requestTracker.f8677a.add(m4883G);
            if (requestTracker.f8679c) {
                singleRequest.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                requestTracker.f8678b.add(m4883G);
            } else {
                singleRequest.mo5285i();
            }
        }
        return y;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    @androidx.annotation.NonNull
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, TranscodeType> m4887K(@androidx.annotation.NonNull android.widget.ImageView r4) {
        /*
            r3 = this;
            com.bumptech.glide.util.Util.m5344a()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            int r0 = r3.f8706b
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = com.bumptech.glide.request.BaseRequestOptions.m5252h(r0, r1)
            if (r0 != 0) goto L50
            boolean r0 = r3.f8719o
            if (r0 == 0) goto L50
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L50
            int[] r0 = com.bumptech.glide.RequestBuilder.C07791.f7942a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L47;
                case 2: goto L3e;
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L35;
                case 6: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L50
        L2c:
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.mo5261k()
            goto L51
        L35:
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.mo5262l()
            goto L51
        L3e:
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.mo5261k()
            goto L51
        L47:
            com.bumptech.glide.request.BaseRequestOptions r0 = r3.clone()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.mo5260j()
            goto L51
        L50:
            r0 = r3
        L51:
            com.bumptech.glide.GlideContext r1 = r3.f7937E
            java.lang.Class<TranscodeType> r2 = r3.f7936D
            com.bumptech.glide.request.target.ImageViewTargetFactory r1 = r1.f7906c
            java.util.Objects.requireNonNull(r1)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L68
            com.bumptech.glide.request.target.BitmapImageViewTarget r1 = new com.bumptech.glide.request.target.BitmapImageViewTarget
            r1.<init>(r4)
            goto L75
        L68:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L7c
            com.bumptech.glide.request.target.DrawableImageViewTarget r1 = new com.bumptech.glide.request.target.DrawableImageViewTarget
            r1.<init>(r4)
        L75:
            r4 = 0
            java.util.concurrent.Executor r2 = com.bumptech.glide.util.Executors.f8839a
            r3.m4886J(r1, r4, r0, r2)
            return r1
        L7c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled class: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.RequestBuilder.m4887K(android.widget.ImageView):com.bumptech.glide.request.target.ViewTarget");
    }

    @NonNull
    @CheckResult
    /* renamed from: L */
    public RequestBuilder<TranscodeType> mo4888L(@Nullable Object obj) {
        this.f7939G = obj;
        this.f7941I = true;
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: M */
    public RequestBuilder<TranscodeType> mo4889M(@Nullable String str) {
        this.f7939G = str;
        this.f7941I = true;
        return this;
    }

    /* renamed from: N */
    public final Request m4890N(Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, BaseRequestOptions<?> baseRequestOptions, RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i2, int i3, Executor executor) {
        Context context = this.f7934B;
        GlideContext glideContext = this.f7937E;
        return SingleRequest.m5301r(context, glideContext, this.f7939G, this.f7936D, baseRequestOptions, i2, i3, priority, target, requestListener, this.f7940H, requestCoordinator, glideContext.f7910g, transitionOptions.f7959b, executor);
    }

    @NonNull
    /* renamed from: O */
    public FutureTarget<TranscodeType> m4891O() {
        RequestFutureTarget requestFutureTarget = new RequestFutureTarget(Integer.MIN_VALUE, Integer.MIN_VALUE);
        m4886J(requestFutureTarget, requestFutureTarget, this, Executors.f8840b);
        return requestFutureTarget;
    }
}
