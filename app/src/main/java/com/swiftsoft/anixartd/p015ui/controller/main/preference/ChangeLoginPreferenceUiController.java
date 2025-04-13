package com.swiftsoft.anixartd.p015ui.controller.main.preference;

import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.ChangeLogin;
import com.swiftsoft.anixartd.epoxy.Typed6EpoxyController;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorSectionModel_;
import com.swiftsoft.anixartd.p015ui.model.common.LoadingModel_;
import com.swiftsoft.anixartd.p015ui.model.common.SeparatorModel_;
import com.swiftsoft.anixartd.p015ui.model.main.DescModel_;
import com.swiftsoft.anixartd.p015ui.model.main.preference.LoginChangeHeaderModel;
import com.swiftsoft.anixartd.p015ui.model.main.preference.LoginChangeHeaderModel_;
import com.swiftsoft.anixartd.p015ui.model.main.preference.LoginChangeHistoryModel_;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p029i.C6284a;

/* compiled from: ChangeLoginPreferenceUiController.kt */
@Metadata(m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\bJ>\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0014J\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0013"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/preference/ChangeLoginPreferenceUiController;", "Lcom/swiftsoft/anixartd/epoxy/Typed6EpoxyController;", "", "Lcom/swiftsoft/anixartd/database/entity/ChangeLogin;", "", "", "", "Lcom/swiftsoft/anixartd/ui/controller/main/preference/ChangeLoginPreferenceUiController$Listener;", "()V", "buildModels", "", "changeLoginHistory", "login", "changeAvailable", "nextChangeAvailableAt", "isLoadable", "listener", "isEmpty", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ChangeLoginPreferenceUiController extends Typed6EpoxyController<List<? extends ChangeLogin>, String, Boolean, Long, Boolean, Listener> {

    /* compiled from: ChangeLoginPreferenceUiController.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/controller/main/preference/ChangeLoginPreferenceUiController$Listener;", "Lcom/swiftsoft/anixartd/ui/model/main/preference/LoginChangeHeaderModel$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends LoginChangeHeaderModel.Listener {
    }

    public ChangeLoginPreferenceUiController() {
        setDebugLoggingEnabled(true);
        setFilterDuplicates(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$2$lambda$1(int i2, int i3, int i4) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$4$lambda$3(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.swiftsoft.anixartd.epoxy.Typed6EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ChangeLogin> list, String str, Boolean bool, Long l2, Boolean bool2, Listener listener) {
        buildModels((List<ChangeLogin>) list, str, bool.booleanValue(), l2.longValue(), bool2.booleanValue(), listener);
    }

    public final boolean isEmpty() {
        return getAdapter().f6911j == 0;
    }

    public void buildModels(@NotNull List<ChangeLogin> changeLoginHistory, @NotNull String login, boolean changeAvailable, long nextChangeAvailableAt, boolean isLoadable, @NotNull Listener listener) {
        Intrinsics.m32179h(changeLoginHistory, "changeLoginHistory");
        Intrinsics.m32179h(login, "login");
        Intrinsics.m32179h(listener, "listener");
        LoginChangeHeaderModel_ loginChangeHeaderModel_ = new LoginChangeHeaderModel_();
        loginChangeHeaderModel_.m4520h2("loginChangeHeader");
        loginChangeHeaderModel_.m4524l2();
        loginChangeHeaderModel_.f29809k = login;
        loginChangeHeaderModel_.m4524l2();
        loginChangeHeaderModel_.f29810l = changeAvailable;
        loginChangeHeaderModel_.m4524l2();
        loginChangeHeaderModel_.f29811m = nextChangeAvailableAt;
        loginChangeHeaderModel_.m4524l2();
        loginChangeHeaderModel_.f29812n = listener;
        add(loginChangeHeaderModel_);
        EpoxyModel<?> separatorModel_ = new SeparatorModel_();
        separatorModel_.m4520h2("separator");
        separatorModel_.f6932i = C6284a.f58031k;
        add(separatorModel_);
        DescModel_ descModel_ = new DescModel_();
        descModel_.m4520h2("desc");
        descModel_.m4524l2();
        descModel_.f29461k = C2507R.string.change_login_history;
        descModel_.f6932i = C6284a.f58032l;
        add(descModel_);
        if (changeLoginHistory.isEmpty()) {
            ErrorSectionModel_ errorSectionModel_ = new ErrorSectionModel_();
            errorSectionModel_.m4520h2("errorSection");
            errorSectionModel_.m4524l2();
            errorSectionModel_.f29386k = C2507R.string.error_no_change_login_history;
            add(errorSectionModel_);
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
