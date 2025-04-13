package com.swiftsoft.anixartd.presentation.main.report;

import com.swiftsoft.anixartd.database.entity.ReportReason;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReportView$$State extends MvpViewState<ReportView> implements ReportView {

    /* compiled from: ReportView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReportView> {
        public OnFailedCommand(ReportView$$State reportView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15197c();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnHideLoadingCommand extends ViewCommand<ReportView> {
        public OnHideLoadingCommand(ReportView$$State reportView$$State) {
            super("onHideLoading", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15201p();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReportView> {
        public OnHideProgressViewCommand(ReportView$$State reportView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15195a();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnLoadingCommand extends ViewCommand<ReportView> {
        public OnLoadingCommand(ReportView$$State reportView$$State) {
            super("onLoading", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15202q();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnMessageInvalidCommand extends ViewCommand<ReportView> {
        public OnMessageInvalidCommand(ReportView$$State reportView$$State) {
            super("onMessageInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15192B2();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnMessageInvalidTooLongCommand extends ViewCommand<ReportView> {
        public OnMessageInvalidTooLongCommand(ReportView$$State reportView$$State) {
            super("onMessageInvalidTooLong", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15193F3();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnMessageInvalidTooShortCommand extends ViewCommand<ReportView> {
        public OnMessageInvalidTooShortCommand(ReportView$$State reportView$$State) {
            super("onMessageInvalidTooShort", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15194J1();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnReasonInvalidCommand extends ViewCommand<ReportView> {
        public OnReasonInvalidCommand(ReportView$$State reportView$$State) {
            super("onReasonInvalid", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15199n2();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnReportCommand extends ViewCommand<ReportView> {

        /* renamed from: a */
        public final List<ReportReason> f27190a;

        public OnReportCommand(ReportView$$State reportView$$State, List<ReportReason> list) {
            super("onReport", OneExecutionStateStrategy.class);
            this.f27190a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15200o2(this.f27190a);
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnReportSentCommand extends ViewCommand<ReportView> {
        public OnReportSentCommand(ReportView$$State reportView$$State) {
            super("onReportSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15198n();
        }
    }

    /* compiled from: ReportView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReportView> {
        public OnShowProgressViewCommand(ReportView$$State reportView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReportView reportView) {
            reportView.mo15196b();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: B2 */
    public void mo15192B2() {
        OnMessageInvalidCommand onMessageInvalidCommand = new OnMessageInvalidCommand(this);
        this.viewCommands.beforeApply(onMessageInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15192B2();
        }
        this.viewCommands.afterApply(onMessageInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: F3 */
    public void mo15193F3() {
        OnMessageInvalidTooLongCommand onMessageInvalidTooLongCommand = new OnMessageInvalidTooLongCommand(this);
        this.viewCommands.beforeApply(onMessageInvalidTooLongCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15193F3();
        }
        this.viewCommands.afterApply(onMessageInvalidTooLongCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: J1 */
    public void mo15194J1() {
        OnMessageInvalidTooShortCommand onMessageInvalidTooShortCommand = new OnMessageInvalidTooShortCommand(this);
        this.viewCommands.beforeApply(onMessageInvalidTooShortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15194J1();
        }
        this.viewCommands.afterApply(onMessageInvalidTooShortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: a */
    public void mo15195a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15195a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: b */
    public void mo15196b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15196b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: c */
    public void mo15197c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15197c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: n */
    public void mo15198n() {
        OnReportSentCommand onReportSentCommand = new OnReportSentCommand(this);
        this.viewCommands.beforeApply(onReportSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15198n();
        }
        this.viewCommands.afterApply(onReportSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: n2 */
    public void mo15199n2() {
        OnReasonInvalidCommand onReasonInvalidCommand = new OnReasonInvalidCommand(this);
        this.viewCommands.beforeApply(onReasonInvalidCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15199n2();
        }
        this.viewCommands.afterApply(onReasonInvalidCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: o2 */
    public void mo15200o2(List<ReportReason> list) {
        OnReportCommand onReportCommand = new OnReportCommand(this, list);
        this.viewCommands.beforeApply(onReportCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15200o2(list);
        }
        this.viewCommands.afterApply(onReportCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: p */
    public void mo15201p() {
        OnHideLoadingCommand onHideLoadingCommand = new OnHideLoadingCommand(this);
        this.viewCommands.beforeApply(onHideLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15201p();
        }
        this.viewCommands.afterApply(onHideLoadingCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.report.ReportView
    /* renamed from: q */
    public void mo15202q() {
        OnLoadingCommand onLoadingCommand = new OnLoadingCommand(this);
        this.viewCommands.beforeApply(onLoadingCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReportView) it.next()).mo15202q();
        }
        this.viewCommands.afterApply(onLoadingCommand);
    }
}
