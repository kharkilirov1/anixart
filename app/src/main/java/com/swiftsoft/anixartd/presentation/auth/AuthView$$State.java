package com.swiftsoft.anixartd.presentation.auth;

import java.util.HashMap;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;

/* loaded from: classes2.dex */
public class AuthView$$State extends MvpViewState<AuthView> implements AuthView {

    /* compiled from: AuthView$$State.java */
    public class OnCheckForInAppUpdatesCommand extends ViewCommand<AuthView> {
        public OnCheckForInAppUpdatesCommand(AuthView$$State authView$$State) {
            super("onCheckForInAppUpdates", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14192f1();
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnGoogleLoginFailedCommand extends ViewCommand<AuthView> {
        public OnGoogleLoginFailedCommand(AuthView$$State authView$$State) {
            super("onGoogleLoginFailed", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14198w0();
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<AuthView> {
        public OnHideLoadingViewCommand(AuthView$$State authView$$State) {
            super("onHideLoadingView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14194j();
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnImmediateUpdateCommand extends ViewCommand<AuthView> {
        public OnImmediateUpdateCommand(AuthView$$State authView$$State) {
            super("onImmediateUpdate", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14191e0();
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnInvalidRequestCommand extends ViewCommand<AuthView> {
        public OnInvalidRequestCommand(AuthView$$State authView$$State) {
            super("onInvalidRequest", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14190P();
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnMainCommand extends ViewCommand<AuthView> {
        public OnMainCommand(AuthView$$State authView$$State) {
            super("onMain", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14197t();
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<AuthView> {
        public OnShowLoadingViewCommand(AuthView$$State authView$$State) {
            super("onShowLoadingView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14193h();
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnSignUpWithGoogleCommand extends ViewCommand<AuthView> {

        /* renamed from: a */
        public final String f25827a;

        /* renamed from: b */
        public final String f25828b;

        public OnSignUpWithGoogleCommand(AuthView$$State authView$$State, String str, String str2) {
            super("onSignUpWithGoogle", AddToEndSingleTagStrategy.class);
            this.f25827a = str;
            this.f25828b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14196q3(this.f25827a, this.f25828b);
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnSignUpWithVkCommand extends ViewCommand<AuthView> {

        /* renamed from: a */
        public final HashMap<String, Object> f25829a;

        public OnSignUpWithVkCommand(AuthView$$State authView$$State, HashMap<String, Object> hashMap) {
            super("onSignUpWithVk", AddToEndSingleTagStrategy.class);
            this.f25829a = hashMap;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14189M1(this.f25829a);
        }
    }

    /* compiled from: AuthView$$State.java */
    public class OnVkLoginFailedCommand extends ViewCommand<AuthView> {
        public OnVkLoginFailedCommand(AuthView$$State authView$$State) {
            super("onVkLoginFailed", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(AuthView authView) {
            authView.mo14195o0();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: M1 */
    public void mo14189M1(HashMap<String, Object> hashMap) {
        OnSignUpWithVkCommand onSignUpWithVkCommand = new OnSignUpWithVkCommand(this, hashMap);
        this.viewCommands.beforeApply(onSignUpWithVkCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14189M1(hashMap);
        }
        this.viewCommands.afterApply(onSignUpWithVkCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: P */
    public void mo14190P() {
        OnInvalidRequestCommand onInvalidRequestCommand = new OnInvalidRequestCommand(this);
        this.viewCommands.beforeApply(onInvalidRequestCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14190P();
        }
        this.viewCommands.afterApply(onInvalidRequestCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: e0 */
    public void mo14191e0() {
        OnImmediateUpdateCommand onImmediateUpdateCommand = new OnImmediateUpdateCommand(this);
        this.viewCommands.beforeApply(onImmediateUpdateCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14191e0();
        }
        this.viewCommands.afterApply(onImmediateUpdateCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: f1 */
    public void mo14192f1() {
        OnCheckForInAppUpdatesCommand onCheckForInAppUpdatesCommand = new OnCheckForInAppUpdatesCommand(this);
        this.viewCommands.beforeApply(onCheckForInAppUpdatesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14192f1();
        }
        this.viewCommands.afterApply(onCheckForInAppUpdatesCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: h */
    public void mo14193h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14193h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: j */
    public void mo14194j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14194j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: o0 */
    public void mo14195o0() {
        OnVkLoginFailedCommand onVkLoginFailedCommand = new OnVkLoginFailedCommand(this);
        this.viewCommands.beforeApply(onVkLoginFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14195o0();
        }
        this.viewCommands.afterApply(onVkLoginFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: q3 */
    public void mo14196q3(String str, String str2) {
        OnSignUpWithGoogleCommand onSignUpWithGoogleCommand = new OnSignUpWithGoogleCommand(this, str, str2);
        this.viewCommands.beforeApply(onSignUpWithGoogleCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14196q3(str, str2);
        }
        this.viewCommands.afterApply(onSignUpWithGoogleCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: t */
    public void mo14197t() {
        OnMainCommand onMainCommand = new OnMainCommand(this);
        this.viewCommands.beforeApply(onMainCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14197t();
        }
        this.viewCommands.afterApply(onMainCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.auth.AuthView
    /* renamed from: w0 */
    public void mo14198w0() {
        OnGoogleLoginFailedCommand onGoogleLoginFailedCommand = new OnGoogleLoginFailedCommand(this);
        this.viewCommands.beforeApply(onGoogleLoginFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((AuthView) it.next()).mo14198w0();
        }
        this.viewCommands.afterApply(onGoogleLoginFailedCommand);
    }
}
