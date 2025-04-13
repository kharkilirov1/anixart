package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class DataPreferenceView$$State extends MvpViewState<DataPreferenceView> implements DataPreferenceView {

    /* compiled from: DataPreferenceView$$State.java */
    public class OnBookmarksExportCommand extends ViewCommand<DataPreferenceView> {

        /* renamed from: a */
        public final int f26539a;

        /* renamed from: b */
        public final List<Integer> f26540b;

        /* renamed from: c */
        public final List<Integer> f26541c;

        /* renamed from: d */
        public final List<Release> f26542d;

        public OnBookmarksExportCommand(DataPreferenceView$$State dataPreferenceView$$State, int i2, List<Integer> list, List<Integer> list2, List<Release> list3) {
            super("onBookmarksExport", OneExecutionStateStrategy.class);
            this.f26539a = i2;
            this.f26540b = list;
            this.f26541c = list2;
            this.f26542d = list3;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DataPreferenceView dataPreferenceView) {
            dataPreferenceView.mo14750j2(this.f26539a, this.f26540b, this.f26541c, this.f26542d);
        }
    }

    /* compiled from: DataPreferenceView$$State.java */
    public class OnBookmarksImportCommand extends ViewCommand<DataPreferenceView> {
        public OnBookmarksImportCommand(DataPreferenceView$$State dataPreferenceView$$State) {
            super("onBookmarksImport", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DataPreferenceView dataPreferenceView) {
            dataPreferenceView.mo14751m1();
        }
    }

    /* compiled from: DataPreferenceView$$State.java */
    public class OnBookmarksImportFailedCommand extends ViewCommand<DataPreferenceView> {
        public OnBookmarksImportFailedCommand(DataPreferenceView$$State dataPreferenceView$$State) {
            super("onBookmarksImportFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DataPreferenceView dataPreferenceView) {
            dataPreferenceView.mo14749i2();
        }
    }

    /* compiled from: DataPreferenceView$$State.java */
    public class OnBookmarksImportLimitReachedCommand extends ViewCommand<DataPreferenceView> {
        public OnBookmarksImportLimitReachedCommand(DataPreferenceView$$State dataPreferenceView$$State) {
            super("onBookmarksImportLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DataPreferenceView dataPreferenceView) {
            dataPreferenceView.mo14752r1();
        }
    }

    /* compiled from: DataPreferenceView$$State.java */
    public class OnBookmarksImportStatusCommand extends ViewCommand<DataPreferenceView> {
        public OnBookmarksImportStatusCommand(DataPreferenceView$$State dataPreferenceView$$State) {
            super("onBookmarksImportStatus", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DataPreferenceView dataPreferenceView) {
            dataPreferenceView.mo14748R2();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: R2 */
    public void mo14748R2() {
        OnBookmarksImportStatusCommand onBookmarksImportStatusCommand = new OnBookmarksImportStatusCommand(this);
        this.viewCommands.beforeApply(onBookmarksImportStatusCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DataPreferenceView) it.next()).mo14748R2();
        }
        this.viewCommands.afterApply(onBookmarksImportStatusCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: i2 */
    public void mo14749i2() {
        OnBookmarksImportFailedCommand onBookmarksImportFailedCommand = new OnBookmarksImportFailedCommand(this);
        this.viewCommands.beforeApply(onBookmarksImportFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DataPreferenceView) it.next()).mo14749i2();
        }
        this.viewCommands.afterApply(onBookmarksImportFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: j2 */
    public void mo14750j2(int i2, List<Integer> list, List<Integer> list2, List<Release> list3) {
        OnBookmarksExportCommand onBookmarksExportCommand = new OnBookmarksExportCommand(this, i2, list, list2, list3);
        this.viewCommands.beforeApply(onBookmarksExportCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DataPreferenceView) it.next()).mo14750j2(i2, list, list2, list3);
        }
        this.viewCommands.afterApply(onBookmarksExportCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: m1 */
    public void mo14751m1() {
        OnBookmarksImportCommand onBookmarksImportCommand = new OnBookmarksImportCommand(this);
        this.viewCommands.beforeApply(onBookmarksImportCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DataPreferenceView) it.next()).mo14751m1();
        }
        this.viewCommands.afterApply(onBookmarksImportCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: r1 */
    public void mo14752r1() {
        OnBookmarksImportLimitReachedCommand onBookmarksImportLimitReachedCommand = new OnBookmarksImportLimitReachedCommand(this);
        this.viewCommands.beforeApply(onBookmarksImportLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DataPreferenceView) it.next()).mo14752r1();
        }
        this.viewCommands.afterApply(onBookmarksImportLimitReachedCommand);
    }
}
