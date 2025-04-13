package com.swiftsoft.anixartd.p015ui.controller.main.episodes.torlook;

import com.swiftsoft.anixartd.database.entity.Torlook;
import com.swiftsoft.anixartd.epoxy.Typed6EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.ListCountExtra_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookErrorModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModel;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModel_;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookNeedForceHint_;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TorlookUiController.kt */
@Metadata(m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0007J>\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006H\u0014J\u0006\u0010\u0010\u001a\u00020\u0005¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/episodes/torlook/TorlookUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed6EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/Torlook;", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/episodes/torlook/TorlookUiController$Listener;", "()V", "buildModels", "", "torlookItems", "searchQuery", "resultDate", "needForce", "isError", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class TorlookUiController extends Typed6EpoxyController<List<? extends Torlook>, String, String, Boolean, Boolean, Listener> {

    /* compiled from: TorlookUiController.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/episodes/torlook/TorlookUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/episodes/torlook/TorlookModel$Listener;", "Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends TorlookModel.Listener, ErrorModel.Listener {
    }

    public TorlookUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed6EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Torlook> list, String str, String str2, Boolean bool, Boolean bool2, Listener listener) {
        buildModels((List<Torlook>) list, str, str2, bool.booleanValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<Torlook> torlookItems, @NotNull String searchQuery, @NotNull String resultDate, boolean needForce, boolean isError, @NotNull Listener listener) {
        Intrinsics.m32179h(torlookItems, "torlookItems");
        Intrinsics.m32179h(searchQuery, "searchQuery");
        Intrinsics.m32179h(resultDate, "resultDate");
        Intrinsics.m32179h(listener, "listener");
        ListCountExtra_ listCountExtra_ = new ListCountExtra_();
        listCountExtra_.mo15989a("listCountExtra");
        listCountExtra_.mo15988N(torlookItems.size());
        listCountExtra_.mo15987B1(resultDate);
        add(listCountExtra_);
        if (needForce) {
            TorlookNeedForceHint_ torlookNeedForceHint_ = new TorlookNeedForceHint_();
            torlookNeedForceHint_.mo16006a("torlookNeedForceHint");
            add(torlookNeedForceHint_);
        }
        int i2 = 0;
        for (Object obj : torlookItems) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            Torlook torlook = (Torlook) obj;
            TorlookModel_ torlookModel_ = new TorlookModel_();
            torlookModel_.mo15994D(Integer.valueOf(i2));
            torlookModel_.mo16005x1(searchQuery);
            torlookModel_.mo16001j(torlook.getTitle());
            torlookModel_.mo15999e1(torlook.getSize());
            torlookModel_.mo16004x0(torlook.getDate());
            torlookModel_.mo16000g0(torlook.getTrackerDomain());
            torlookModel_.mo15995M1(torlook.getTrackerIcon());
            torlookModel_.mo15996N0(torlook.getSeedCount());
            torlookModel_.mo15998U1(torlook.getLeechCount());
            torlookModel_.mo16002l1(torlook.getLink());
            torlookModel_.mo15997S1(torlook.getMagnetLink());
            torlookModel_.mo16003m1(listener);
            add(torlookModel_);
            i2 = i3;
        }
        if (isError || torlookItems.isEmpty()) {
            TorlookErrorModel_ torlookErrorModel_ = new TorlookErrorModel_();
            torlookErrorModel_.mo15990a("torlookError");
            add(torlookErrorModel_);
        }
    }
}
