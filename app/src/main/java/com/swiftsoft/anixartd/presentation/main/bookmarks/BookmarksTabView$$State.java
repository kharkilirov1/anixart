package com.swiftsoft.anixartd.presentation.main.bookmarks;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class BookmarksTabView$$State extends MvpViewState<BookmarksTabView> implements BookmarksTabView {

    /* compiled from: BookmarksTabView$$State.java */
    public class OnCollectionCommand extends ViewCommand<BookmarksTabView> {

        /* renamed from: a */
        public final Collection f26060a;

        public OnCollectionCommand(BookmarksTabView$$State bookmarksTabView$$State, Collection collection) {
            super("onCollection", OneExecutionStateStrategy.class);
            this.f26060a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14374v(this.f26060a);
        }
    }

    /* compiled from: BookmarksTabView$$State.java */
    public class OnFailedCommand extends ViewCommand<BookmarksTabView> {
        public OnFailedCommand(BookmarksTabView$$State bookmarksTabView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14368c();
        }
    }

    /* compiled from: BookmarksTabView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<BookmarksTabView> {
        public OnHideProgressViewCommand(BookmarksTabView$$State bookmarksTabView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14366a();
        }
    }

    /* compiled from: BookmarksTabView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<BookmarksTabView> {
        public OnHideRefreshViewCommand(BookmarksTabView$$State bookmarksTabView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14370e();
        }
    }

    /* compiled from: BookmarksTabView$$State.java */
    public class OnRandomCommand extends ViewCommand<BookmarksTabView> {

        /* renamed from: a */
        public final String f26061a;

        public OnRandomCommand(BookmarksTabView$$State bookmarksTabView$$State, String str) {
            super("onRandom", OneExecutionStateStrategy.class);
            this.f26061a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14373p2(this.f26061a);
        }
    }

    /* compiled from: BookmarksTabView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<BookmarksTabView> {
        public OnRefreshAfterSortCommand(BookmarksTabView$$State bookmarksTabView$$State) {
            super("onRefreshAfterSort", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14372l();
        }
    }

    /* compiled from: BookmarksTabView$$State.java */
    public class OnReleaseCommand extends ViewCommand<BookmarksTabView> {

        /* renamed from: a */
        public final Release f26062a;

        public OnReleaseCommand(BookmarksTabView$$State bookmarksTabView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26062a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14371i(this.f26062a);
        }
    }

    /* compiled from: BookmarksTabView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<BookmarksTabView> {
        public OnShowProgressViewCommand(BookmarksTabView$$State bookmarksTabView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14367b();
        }
    }

    /* compiled from: BookmarksTabView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<BookmarksTabView> {
        public OnShowRefreshViewCommand(BookmarksTabView$$State bookmarksTabView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(BookmarksTabView bookmarksTabView) {
            bookmarksTabView.mo14369d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: a */
    public void mo14366a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14366a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: b */
    public void mo14367b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14367b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: c */
    public void mo14368c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14368c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: d */
    public void mo14369d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14369d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: e */
    public void mo14370e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14370e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: i */
    public void mo14371i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14371i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: l */
    public void mo14372l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14372l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: p2 */
    public void mo14373p2(String str) {
        OnRandomCommand onRandomCommand = new OnRandomCommand(this, str);
        this.viewCommands.beforeApply(onRandomCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14373p2(str);
        }
        this.viewCommands.afterApply(onRandomCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabView
    /* renamed from: v */
    public void mo14374v(Collection collection) {
        OnCollectionCommand onCollectionCommand = new OnCollectionCommand(this, collection);
        this.viewCommands.beforeApply(onCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((BookmarksTabView) it.next()).mo14374v(collection);
        }
        this.viewCommands.afterApply(onCollectionCommand);
    }
}
