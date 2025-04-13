package com.swiftsoft.anixartd.p015ui.controller.main.genres;

import com.airbnb.epoxy.Typed3EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.CheckboxModel;
import com.swiftsoft.anixartd.p015ui.model.common.CheckboxModel_;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ChooseGenresUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/genres/ChooseGenresUiController;", "Lcom/airbnb/epoxy/Typed3EpoxyController;", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/genres/ChooseGenresUiController$Listener;", "()V", "buildModels", "", "genres", "selectedGenres", "listener", "([Ljava/lang/String;Ljava/util/Collection;Lcom/swiftsoft/anixartd/ui/controller/main/genres/ChooseGenresUiController$Listener;)V", "isEmpty", "", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ChooseGenresUiController extends Typed3EpoxyController<String[], Collection<? extends String>, Listener> {

    /* compiled from: ChooseGenresUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/genres/ChooseGenresUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/CheckboxModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CheckboxModel.Listener {
    }

    public ChooseGenresUiController() {
        setDebugLoggingEnabled(true);
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(String[] strArr, Collection<? extends String> collection, Listener listener) {
        buildModels2(strArr, (Collection<String>) collection, listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull String[] genres, @NotNull Collection<String> selectedGenres, @NotNull Listener listener) {
        Intrinsics.m32179h(genres, "genres");
        Intrinsics.m32179h(selectedGenres, "selectedGenres");
        Intrinsics.m32179h(listener, "listener");
        int length = genres.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = genres[i2];
            CheckboxModel_ checkboxModel_ = new CheckboxModel_();
            checkboxModel_.mo15716D(Integer.valueOf(i3));
            checkboxModel_.mo15720j(str);
            checkboxModel_.mo15719Q1(i3);
            checkboxModel_.mo15718L0(selectedGenres.contains(str));
            checkboxModel_.mo15717E0(listener);
            add(checkboxModel_);
            i2++;
            i3++;
        }
    }
}
