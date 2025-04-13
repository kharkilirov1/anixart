package com.swiftsoft.anixartd.p015ui.controller.main.streaming;

import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.ReleaseStreamingPlatform;
import com.swiftsoft.anixartd.epoxy.Typed5EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.SeparatorModel_;
import com.swiftsoft.anixartd.p015ui.model.main.DescModel_;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.EmptyReleaseStreamingPlatformModel_;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModel;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseStreamingPlatformModel_;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModel;
import com.swiftsoft.anixartd.p015ui.model.main.streaming.ReleaseThirdPartyPlatformModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p031j.C6523a;

/* compiled from: ReleaseStreamingPlatformUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002&\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0007J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\u0006\u0010\u000f\u001a\u00020\u0005¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/streaming/ReleaseStreamingPlatformUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyController;", "", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseStreamingPlatform;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/streaming/ReleaseStreamingPlatformUiController$Listener;", "()V", "buildModels", "", "releaseId", "releaseStreamingPlatforms", "isThirdPartyPlatformsDisabled", "totalCount", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseStreamingPlatformUiController extends Typed5EpoxyController<Long, List<? extends ReleaseStreamingPlatform>, Boolean, Long, Listener> {

    /* compiled from: ReleaseStreamingPlatformUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/streaming/ReleaseStreamingPlatformUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/streaming/ReleaseStreamingPlatformModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/streaming/ReleaseThirdPartyPlatformModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseStreamingPlatformModel.Listener, ReleaseThirdPartyPlatformModel.Listener {
    }

    public ReleaseStreamingPlatformUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$5$lambda$4(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$7$lambda$6(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$9$lambda$8(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed5EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Long l2, List<? extends ReleaseStreamingPlatform> list, Boolean bool, Long l3, Listener listener) {
        buildModels(l2.longValue(), (List<ReleaseStreamingPlatform>) list, bool.booleanValue(), l3.longValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(long releaseId, @NotNull List<ReleaseStreamingPlatform> releaseStreamingPlatforms, boolean isThirdPartyPlatformsDisabled, long totalCount, @NotNull Listener listener) {
        Intrinsics.m32179h(releaseStreamingPlatforms, "releaseStreamingPlatforms");
        Intrinsics.m32179h(listener, "listener");
        DescModel_ descModel_ = new DescModel_();
        descModel_.mo15799a("desc");
        descModel_.mo15798M0(C2507R.string.result_of_search);
        descModel_.mo15800d(C6523a.f63024o);
        add(descModel_);
        if (!releaseStreamingPlatforms.isEmpty()) {
            for (ReleaseStreamingPlatform releaseStreamingPlatform : releaseStreamingPlatforms) {
                ReleaseStreamingPlatformModel_ releaseStreamingPlatformModel_ = new ReleaseStreamingPlatformModel_();
                releaseStreamingPlatformModel_.mo16280b(releaseStreamingPlatform.getId());
                releaseStreamingPlatformModel_.mo16282z(releaseStreamingPlatform.getName());
                releaseStreamingPlatformModel_.mo16281j0(releaseStreamingPlatform.getIcon());
                releaseStreamingPlatformModel_.mo16279H0(releaseStreamingPlatform.getUrl());
                releaseStreamingPlatformModel_.mo16278A1(listener);
                add(releaseStreamingPlatformModel_);
            }
        } else {
            EmptyReleaseStreamingPlatformModel_ emptyReleaseStreamingPlatformModel_ = new EmptyReleaseStreamingPlatformModel_();
            emptyReleaseStreamingPlatformModel_.mo16274a("emptyReleaseStreamingPlatform");
            emptyReleaseStreamingPlatformModel_.mo16275d(C6523a.f63025p);
            add(emptyReleaseStreamingPlatformModel_);
        }
        if (isThirdPartyPlatformsDisabled) {
            return;
        }
        SeparatorModel_ separatorModel_ = new SeparatorModel_();
        separatorModel_.mo15779a("separator");
        separatorModel_.mo15780d(C6523a.f63026q);
        add(separatorModel_);
        ReleaseThirdPartyPlatformModel_ releaseThirdPartyPlatformModel_ = new ReleaseThirdPartyPlatformModel_();
        releaseThirdPartyPlatformModel_.mo16284a("releaseThirdPartyPlatform");
        releaseThirdPartyPlatformModel_.mo16286y0(listener);
        releaseThirdPartyPlatformModel_.mo16285d(C6523a.f63027r);
        add(releaseThirdPartyPlatformModel_);
    }
}
