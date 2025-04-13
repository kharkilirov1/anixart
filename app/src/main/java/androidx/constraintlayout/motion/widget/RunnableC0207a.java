package androidx.constraintlayout.motion.widget;

import android.app.job.JobParameters;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Surface;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.banner.C4636d;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.nativeads.C6236t;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.SliderAd;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0207a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f2666b;

    /* renamed from: c */
    public final /* synthetic */ Object f2667c;

    /* renamed from: d */
    public final /* synthetic */ Object f2668d;

    public /* synthetic */ RunnableC0207a(Object obj, Object obj2, int i2) {
        this.f2666b = i2;
        this.f2667c = obj;
        this.f2668d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        switch (this.f2666b) {
            case 1:
                ((ResourcesCompat.FontCallback) this.f2667c).mo796e((Typeface) this.f2668d);
                return;
            case 2:
                FragmentStrictMode.Policy policy = (FragmentStrictMode.Policy) this.f2667c;
                Violation violation = (Violation) this.f2668d;
                FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f4520a;
                Intrinsics.m32179h(policy, "$policy");
                Intrinsics.m32179h(violation, "$violation");
                policy.f4533b.m3169a(violation);
                return;
            case 3:
                String str = (String) this.f2667c;
                Violation violation2 = (Violation) this.f2668d;
                FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f4520a;
                Intrinsics.m32179h(violation2, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation2);
                throw violation2;
            case 4:
            default:
                ((RewardedAd) this.f2667c).m30760a((AdRequest) this.f2668d);
                return;
            case 5:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper this$0 = (SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) this.f2667c;
                WindowLayoutInfo newLayoutInfo = (WindowLayoutInfo) this.f2668d;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(newLayoutInfo, "$newLayoutInfo");
                this$0.f6793c.accept(newLayoutInfo);
                return;
            case 6:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f2667c;
                JobParameters jobParameters = (JobParameters) this.f2668d;
                int i3 = JobInfoSchedulerService.f9282b;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 7:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) this.f2667c;
                String str2 = (String) this.f2668d;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.f10306b;
                int i4 = Util.f14736a;
                audioRendererEventListener.mo5962l(str2);
                return;
            case 8:
                NetworkTypeObserver networkTypeObserver = (NetworkTypeObserver) this.f2667c;
                NetworkTypeObserver.Listener listener = (NetworkTypeObserver.Listener) this.f2668d;
                synchronized (networkTypeObserver.f14690c) {
                    i2 = networkTypeObserver.f14691d;
                }
                listener.mo7483a(i2);
                return;
            case 9:
                VideoRendererEventListener.EventDispatcher eventDispatcher2 = (VideoRendererEventListener.EventDispatcher) this.f2667c;
                VideoSize videoSize = (VideoSize) this.f2668d;
                VideoRendererEventListener videoRendererEventListener = eventDispatcher2.f14899b;
                int i5 = Util.f14736a;
                videoRendererEventListener.onVideoSizeChanged(videoSize);
                return;
            case 10:
                VideoRendererEventListener.EventDispatcher eventDispatcher3 = (VideoRendererEventListener.EventDispatcher) this.f2667c;
                String str3 = (String) this.f2668d;
                VideoRendererEventListener videoRendererEventListener2 = eventDispatcher3.f14899b;
                int i6 = Util.f14736a;
                videoRendererEventListener2.mo5955a(str3);
                return;
            case 11:
                VideoRendererEventListener.EventDispatcher eventDispatcher4 = (VideoRendererEventListener.EventDispatcher) this.f2667c;
                Exception exc = (Exception) this.f2668d;
                VideoRendererEventListener videoRendererEventListener3 = eventDispatcher4.f14899b;
                int i7 = Util.f14736a;
                videoRendererEventListener3.mo5975z(exc);
                return;
            case 12:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f2667c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f2668d;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f14980h;
                Surface surface = sphericalGLSurfaceView.f14981i;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.f14980h = surfaceTexture;
                sphericalGLSurfaceView.f14981i = surface2;
                Iterator<SphericalGLSurfaceView.VideoSurfaceListener> it = sphericalGLSurfaceView.f14974b.iterator();
                while (it.hasNext()) {
                    it.next().mo5966p(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 13:
                ((C4636d) this.f2667c).m21758a((AdRequestError) this.f2668d);
                return;
            case 14:
                ((C4636d) this.f2667c).m21759a((ImpressionData) this.f2668d);
                return;
            case 15:
                ((AbstractC4639g) this.f2667c).m21789a((AdRequest) this.f2668d);
                return;
            case 16:
                ((InterstitialAd) this.f2667c).m30408a((AdRequest) this.f2668d);
                return;
            case 17:
                C6236t.m30638a((C5563p2) this.f2667c, (C6236t) this.f2668d);
                return;
            case 18:
                C6236t.m30641a((C6236t) this.f2667c, (List) this.f2668d);
                return;
            case 19:
                C6236t.m30640a((C6236t) this.f2667c, (SliderAd) this.f2668d);
                return;
            case 20:
                C6236t.m30639a((C6236t) this.f2667c, (NativeAd) this.f2668d);
                return;
        }
    }
}
