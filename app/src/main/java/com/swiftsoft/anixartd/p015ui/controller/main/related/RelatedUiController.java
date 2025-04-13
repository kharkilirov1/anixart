package com.swiftsoft.anixartd.p015ui.controller.main.related;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStatus;
import com.swiftsoft.anixartd.epoxy.Typed8EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.RelatedHeaderModel_;
import com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModel;
import com.swiftsoft.anixartd.p015ui.model.main.release.RelatedModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031j.C6523a;

/* compiled from: RelatedUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002<\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\bJW\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0006¨\u0006\u0016"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/related/RelatedUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed8EpoxyController;", "", "", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "", "Lcom/swiftsoft/anixartd/ui/controller/main/related/RelatedUiController$Listener;", "()V", "buildModels", "", "releaseId", "nameRu", "description", "image", "related", "totalCount", "isLoadable", "listener", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JZLcom/swiftsoft/anixartd/ui/controller/main/related/RelatedUiController$Listener;)V", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class RelatedUiController extends Typed8EpoxyController<Long, String, String, String, List<? extends Release>, Long, Boolean, Listener> {

    /* compiled from: RelatedUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/related/RelatedUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/release/RelatedModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends RelatedModel.Listener {
    }

    public RelatedUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$1$lambda$0(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed8EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Long l2, String str, String str2, String str3, List<? extends Release> list, Long l3, Boolean bool, Listener listener) {
        buildModels(l2, str, str2, str3, (List<Release>) list, l3.longValue(), bool.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@Nullable Long releaseId, @NotNull String nameRu, @Nullable String description, @NotNull String image, @NotNull List<Release> related, long totalCount, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(nameRu, "nameRu");
        Intrinsics.m32179h(image, "image");
        Intrinsics.m32179h(related, "related");
        Intrinsics.m32179h(listener, "listener");
        RelatedHeaderModel_ relatedHeaderModel_ = new RelatedHeaderModel_();
        relatedHeaderModel_.mo16174a("relatedHeader");
        relatedHeaderModel_.mo16178l0(nameRu);
        relatedHeaderModel_.mo16177g(description);
        relatedHeaderModel_.mo16175c(image);
        relatedHeaderModel_.mo16176d(C6523a.f63014e);
        add(relatedHeaderModel_);
        int i2 = 0;
        for (Object obj : related) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            Release release = (Release) obj;
            RelatedModel_ relatedModel_ = new RelatedModel_();
            relatedModel_.mo16188b(release.getId());
            relatedModel_.mo16190d0(releaseId);
            relatedModel_.mo16191e(release.getTitleRu());
            relatedModel_.mo16199n(release.getEpisodesReleased());
            relatedModel_.mo16198m(release.getEpisodesTotal());
            relatedModel_.mo16195h(Double.valueOf(release.getGrade()));
            relatedModel_.mo16194g(release.getDescription());
            relatedModel_.mo16189c(release.getImage());
            relatedModel_.mo16187T(release.getCategory());
            relatedModel_.mo16182A(release.getYear());
            relatedModel_.mo16185I(release.getSeason());
            ReleaseStatus status = release.getStatus();
            relatedModel_.mo16183C(status != null ? Long.valueOf(status.getId()) : null);
            relatedModel_.mo16186J(release.getAiredOnDate());
            relatedModel_.mo16192f(release.getIsFavorite());
            relatedModel_.mo16200o(release.getProfileListStatus());
            boolean z = true;
            relatedModel_.mo16197i(release.getVoteCount() > 50);
            relatedModel_.mo16196h0(i2 == 0);
            if (i2 != ((int) totalCount) - 1) {
                z = false;
            }
            relatedModel_.mo16184E1(z);
            relatedModel_.mo16193f1(listener);
            add(relatedModel_);
            i2 = i3;
        }
        if (isLoadable) {
            LoadingModel_ loadingModel_ = new LoadingModel_();
            loadingModel_.mo15729a("loading");
            add(loadingModel_);
        }
    }
}
