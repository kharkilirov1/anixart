package com.swiftsoft.anixartd.presentation.main.search;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class SearchView$$State extends MvpViewState<SearchView> implements SearchView {

    /* compiled from: SearchView$$State.java */
    public class OnCollectionCommand extends ViewCommand<SearchView> {

        /* renamed from: a */
        public final Collection f27233a;

        public OnCollectionCommand(SearchView$$State searchView$$State, Collection collection) {
            super("onCollection", OneExecutionStateStrategy.class);
            this.f27233a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15231v(this.f27233a);
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnFailedCommand extends ViewCommand<SearchView> {
        public OnFailedCommand(SearchView$$State searchView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15226c();
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<SearchView> {
        public OnHideProgressViewCommand(SearchView$$State searchView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15224a();
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<SearchView> {
        public OnHideRefreshViewCommand(SearchView$$State searchView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15228e();
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnLoadedCommand extends ViewCommand<SearchView> {
        public OnLoadedCommand(SearchView$$State searchView$$State) {
            super("onLoaded", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15222O();
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnProfileCommand extends ViewCommand<SearchView> {

        /* renamed from: a */
        public final Profile f27234a;

        public OnProfileCommand(SearchView$$State searchView$$State, Profile profile) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f27234a = profile;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15230j3(this.f27234a);
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnRelatedCommand extends ViewCommand<SearchView> {

        /* renamed from: a */
        public final long f27235a;

        /* renamed from: b */
        public final String f27236b;

        /* renamed from: c */
        public final String f27237c;

        /* renamed from: d */
        public final String f27238d;

        public OnRelatedCommand(SearchView$$State searchView$$State, long j2, String str, String str2, String str3) {
            super("onRelated", OneExecutionStateStrategy.class);
            this.f27235a = j2;
            this.f27236b = str;
            this.f27237c = str2;
            this.f27238d = str3;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15223Q2(this.f27235a, this.f27236b, this.f27237c, this.f27238d);
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnReleaseCommand extends ViewCommand<SearchView> {

        /* renamed from: a */
        public final Release f27239a;

        public OnReleaseCommand(SearchView$$State searchView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f27239a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15229i(this.f27239a);
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnSearchCommand extends ViewCommand<SearchView> {

        /* renamed from: a */
        public final String f27240a;

        public OnSearchCommand(SearchView$$State searchView$$State, String str) {
            super("onSearch", OneExecutionStateStrategy.class);
            this.f27240a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15221C2(this.f27240a);
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<SearchView> {
        public OnShowProgressViewCommand(SearchView$$State searchView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15225b();
        }
    }

    /* compiled from: SearchView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<SearchView> {
        public OnShowRefreshViewCommand(SearchView$$State searchView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(SearchView searchView) {
            searchView.mo15227d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: C2 */
    public void mo15221C2(String str) {
        OnSearchCommand onSearchCommand = new OnSearchCommand(this, str);
        this.viewCommands.beforeApply(onSearchCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15221C2(str);
        }
        this.viewCommands.afterApply(onSearchCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: O */
    public void mo15222O() {
        OnLoadedCommand onLoadedCommand = new OnLoadedCommand(this);
        this.viewCommands.beforeApply(onLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15222O();
        }
        this.viewCommands.afterApply(onLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: Q2 */
    public void mo15223Q2(long j2, String str, String str2, String str3) {
        OnRelatedCommand onRelatedCommand = new OnRelatedCommand(this, j2, str, str2, str3);
        this.viewCommands.beforeApply(onRelatedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15223Q2(j2, str, str2, str3);
        }
        this.viewCommands.afterApply(onRelatedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: a */
    public void mo15224a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15224a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: b */
    public void mo15225b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15225b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: c */
    public void mo15226c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15226c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: d */
    public void mo15227d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15227d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: e */
    public void mo15228e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15228e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: i */
    public void mo15229i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15229i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: j3 */
    public void mo15230j3(Profile profile) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, profile);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15230j3(profile);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.search.SearchView
    /* renamed from: v */
    public void mo15231v(Collection collection) {
        OnCollectionCommand onCollectionCommand = new OnCollectionCommand(this, collection);
        this.viewCommands.beforeApply(onCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((SearchView) it.next()).mo15231v(collection);
        }
        this.viewCommands.afterApply(onCollectionCommand);
    }
}
