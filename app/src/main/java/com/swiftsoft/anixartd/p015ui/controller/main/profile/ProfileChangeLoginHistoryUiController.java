package com.swiftsoft.anixartd.p015ui.controller.main.profile;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.ChangeLogin;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorResourceModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.main.preference.LoginChangeHeaderModel;
import com.swiftsoft.anixartd.p015ui.model.main.preference.LoginChangeHistoryModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileChangeLoginHistoryUiController.kt */
@Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u0004¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileChangeLoginHistoryUiController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/ChangeLogin;", "", "()V", "buildModels", "", "changeLoginHistory", "isLoadable", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileChangeLoginHistoryUiController extends Typed2EpoxyController<List<? extends ChangeLogin>, Boolean> {

    /* compiled from: ProfileChangeLoginHistoryUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/profile/ProfileChangeLoginHistoryUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/preference/LoginChangeHeaderModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends LoginChangeHeaderModel.Listener {
    }

    public ProfileChangeLoginHistoryUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ChangeLogin> list, Boolean bool) {
        buildModels((List<ChangeLogin>) list, bool.booleanValue());
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<ChangeLogin> changeLoginHistory, boolean isLoadable) {
        Intrinsics.m32179h(changeLoginHistory, "changeLoginHistory");
        if (changeLoginHistory.isEmpty()) {
            ErrorResourceModel_ errorResourceModel_ = new ErrorResourceModel_();
            errorResourceModel_.m4520h2("errorResource");
            errorResourceModel_.m4524l2();
            errorResourceModel_.f29385k = C2507R.string.error_no_change_login_history;
            add(errorResourceModel_);
        } else {
            for (ChangeLogin changeLogin : changeLoginHistory) {
                LoginChangeHistoryModel_ loginChangeHistoryModel_ = new LoginChangeHistoryModel_();
                loginChangeHistoryModel_.m16037v2(changeLogin.getId());
                String newLogin = changeLogin.getNewLogin();
                loginChangeHistoryModel_.m4524l2();
                loginChangeHistoryModel_.f29814k = newLogin;
                long timestamp = changeLogin.getTimestamp();
                loginChangeHistoryModel_.m4524l2();
                loginChangeHistoryModel_.f29815l = timestamp;
                add(loginChangeHistoryModel_);
            }
        }
        if (isLoadable) {
            EpoxyModel<?> loadingModel_ = new LoadingModel_();
            loadingModel_.m4520h2("loading");
            add(loadingModel_);
        }
    }
}
