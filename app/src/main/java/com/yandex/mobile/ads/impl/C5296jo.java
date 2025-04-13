package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.ub1;
import com.yandex.mobile.ads.instream.view.InstreamMuteView;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.jo */
/* loaded from: classes3.dex */
public final class C5296jo {

    /* renamed from: a */
    @NotNull
    private final u40 f51674a;

    /* renamed from: b */
    @NotNull
    private final qy0<VideoAdControlsContainer> f51675b;

    public C5296jo(@NotNull u40 instreamDesign) {
        Intrinsics.m32179h(instreamDesign, "instreamDesign");
        this.f51674a = instreamDesign;
        this.f51675b = new qy0<>();
    }

    @Nullable
    /* renamed from: a */
    public final ub1 m25915a(@NotNull Context context, @NotNull ViewGroup rootView) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(rootView, "rootView");
        int m30053a = z40.m30053a(this.f51674a);
        Objects.requireNonNull(this.f51675b);
        VideoAdControlsContainer videoAdControlsContainer = (VideoAdControlsContainer) qy0.m27797a(context, VideoAdControlsContainer.class, m30053a, rootView);
        if (videoAdControlsContainer == null) {
            return null;
        }
        ImageView imageView = (ImageView) videoAdControlsContainer.findViewById(C4632R.id.sponsored_image);
        ImageView imageView2 = (ImageView) videoAdControlsContainer.findViewById(C4632R.id.favicon);
        TextView textView = (TextView) videoAdControlsContainer.findViewById(C4632R.id.call_to_action);
        ImageView imageView3 = (ImageView) videoAdControlsContainer.findViewById(C4632R.id.instream_call_to_action);
        InstreamMuteView instreamMuteView = (InstreamMuteView) videoAdControlsContainer.findViewById(C4632R.id.instream_mute);
        ProgressBar progressBar = (ProgressBar) videoAdControlsContainer.findViewById(C4632R.id.instream_progress_display_view);
        View findViewById = videoAdControlsContainer.findViewById(C4632R.id.instream_skip);
        TextView textView2 = (TextView) videoAdControlsContainer.findViewById(C4632R.id.domain);
        TextView textView3 = (TextView) videoAdControlsContainer.findViewById(C4632R.id.sponsored);
        TextView textView4 = (TextView) videoAdControlsContainer.findViewById(C4632R.id.ad_position);
        ImageView imageView4 = (ImageView) videoAdControlsContainer.findViewById(C4632R.id.trademark_icon);
        TextView textView5 = (TextView) videoAdControlsContainer.findViewById(C4632R.id.trademark_delimiter);
        View findViewById2 = videoAdControlsContainer.findViewById(C4632R.id.instream_cta_container);
        ImageView imageView5 = (ImageView) videoAdControlsContainer.findViewById(C4632R.id.feedback);
        TextView textView6 = (TextView) videoAdControlsContainer.findViewById(C4632R.id.timer_value);
        ub1 m28968a = new ub1.C5854a(videoAdControlsContainer).m28974d(imageView).m28970b(imageView2).m28971b(textView).m28964a(imageView3).m28967a((xg0) instreamMuteView).m28965a(progressBar).m28969b(findViewById).m28977e(textView3).m28973c(textView2).m28966a(textView4).m28976e(imageView4).m28978f(textView5).m28975d(textView6).m28963a(findViewById2).m28972c(imageView5).m28979g((TextView) videoAdControlsContainer.findViewById(C4632R.id.warning)).m28968a();
        Intrinsics.m32178g(m28968a, "Builder(controlsContaine…iew)\n            .build()");
        return m28968a;
    }
}
