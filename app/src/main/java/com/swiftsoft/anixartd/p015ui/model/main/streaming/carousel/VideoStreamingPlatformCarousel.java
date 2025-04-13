package com.swiftsoft.anixartd.p015ui.model.main.streaming.carousel;

import android.content.Context;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.ModelView;
import com.swiftsoft.anixartd.p015ui.model.HorizontalCarousel;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VideoStreamingPlatformCarousel.kt */
@ModelView
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/streaming/carousel/VideoStreamingPlatformCarousel;", "Lcom/swiftsoft/anixartd/ui/model/HorizontalCarousel;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class VideoStreamingPlatformCarousel extends HorizontalCarousel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoStreamingPlatformCarousel(@NotNull Context context) {
        super(context);
        Intrinsics.m32179h(context, "context");
        new LinkedHashMap();
        Carousel.setDefaultGlobalSnapHelperFactory(null);
        setNestedScrollingEnabled(false);
    }
}
