package com.swiftsoft.anixartd.presentation.main.genres;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.p015ui.controller.main.genres.ChooseGenresUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.genres.ChooseGenresUiLogic;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ChooseGenresPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/genres/ChooseGenresPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/genres/ChooseGenresView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseGenresPresenter extends MvpPresenter<ChooseGenresView> {

    /* renamed from: a */
    @NotNull
    public ChooseGenresUiLogic f26403a;

    /* renamed from: b */
    @NotNull
    public ChooseGenresUiController f26404b;

    /* renamed from: c */
    @NotNull
    public Listener f26405c;

    /* compiled from: ChooseGenresPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/genres/ChooseGenresPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/genres/ChooseGenresUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ChooseGenresUiController.Listener {
    }

    @Inject
    public ChooseGenresPresenter(@NotNull Prefs prefs) {
        Intrinsics.m32179h(prefs, "prefs");
        this.f26403a = new ChooseGenresUiLogic();
        this.f26404b = new ChooseGenresUiController();
        this.f26405c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.genres.ChooseGenresPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.common.CheckboxModel.Listener
            /* renamed from: a */
            public void mo14649a(boolean z, int i2) {
                boolean z2 = true;
                if (z) {
                    ChooseGenresUiLogic chooseGenresUiLogic = ChooseGenresPresenter.this.f26403a;
                    String str = (String) ArraysKt.m31931G(chooseGenresUiLogic.m15683a(), i2);
                    System.out.println((Object) "select genre");
                    if (str != null) {
                        if (!chooseGenresUiLogic.f29098c.containsKey(Integer.valueOf(i2))) {
                            chooseGenresUiLogic.f29098c.put(Integer.valueOf(i2), str);
                        }
                    }
                    z2 = false;
                } else {
                    ChooseGenresUiLogic chooseGenresUiLogic2 = ChooseGenresPresenter.this.f26403a;
                    String str2 = (String) ArraysKt.m31931G(chooseGenresUiLogic2.m15683a(), i2);
                    StringBuilder m28y = C0000a.m28y("unselect genre: ", str2, " && ");
                    m28y.append(chooseGenresUiLogic2.f29098c.containsValue(str2));
                    System.out.println((Object) m28y.toString());
                    if (str2 != null) {
                        if (chooseGenresUiLogic2.f29098c.containsKey(Integer.valueOf(i2))) {
                            chooseGenresUiLogic2.f29098c.remove(Integer.valueOf(i2));
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    ChooseGenresPresenter.this.getViewState().mo14650W1();
                    ChooseGenresPresenter.this.m14648a();
                }
            }
        };
    }

    /* renamed from: a */
    public final void m14648a() {
        this.f26404b.setData(this.f26403a.m15683a(), this.f26403a.f29098c.values(), this.f26405c);
    }
}
