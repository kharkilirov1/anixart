package com.swiftsoft.anixartd.p015ui.fragment.main.collection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.inputmethod.C0273a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.CollectionCommentsUiLogic;
import com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.Keyboard;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnCommentingRules;
import com.swiftsoft.anixartd.utils.OnFetchCollectionComment;
import com.swiftsoft.anixartd.utils.OnRemoveCollectionComment;
import com.swiftsoft.anixartd.utils.OnSnackbar;
import com.swiftsoft.anixartd.utils.OnSoftInputMode;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionCommentsFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionCommentsFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/collection/comments/CollectionCommentsView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnFetchCollectionComment;", "onFetchCollectionComment", "", "onFetchComment", "Lcom/swiftsoft/anixartd/utils/OnRemoveCollectionComment;", "onRemoveCollectionComment", "onRemoveComment", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionCommentsFragment extends BaseFragment implements CollectionCommentsView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: e */
    @Inject
    public Lazy<CollectionCommentsPresenter> f27913e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27914f;

    /* renamed from: g */
    public long f27915g;

    /* renamed from: h */
    @Nullable
    public Long f27916h;

    /* renamed from: i */
    public Collection f27917i;

    /* renamed from: j */
    public EndlessRecyclerViewScrollListener f27918j;

    /* renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f27911m = {C2052a.m12277l(CollectionCommentsFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/collection/comments/CollectionCommentsPresenter;", 0)};

    /* renamed from: l */
    @NotNull
    public static final Companion f27910l = new Companion(null);

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f27919k = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27912d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = CollectionCommentsFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: CollectionCommentsFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionCommentsFragment$Companion;", "", "", "COLLECTION_VALUE", "Ljava/lang/String;", "COMMENT_ID_VALUE", "COMMENT_PROCESS_DIALOG_TAG", "ID_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CollectionCommentsFragment() {
        Function0<CollectionCommentsPresenter> function0 = new Function0<CollectionCommentsPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CollectionCommentsPresenter invoke() {
                Lazy<CollectionCommentsPresenter> lazy = CollectionCommentsFragment.this.f27913e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27914f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(CollectionCommentsPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: A */
    public void mo14431A() {
        ProgressBar sendProgress = (ProgressBar) m15461A3(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15461A3(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
        Context context = getContext();
        if (context != null) {
            Dialogs dialogs = Dialogs.f30143a;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            String string2 = getString(C2507R.string.error_comment_limit_reached);
            Intrinsics.m32178g(string2, "getString(R.string.error_comment_limit_reached)");
            dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
        }
    }

    @Nullable
    /* renamed from: A3 */
    public View m15461A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27919k;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: B */
    public void mo14432B() {
        ((EditText) m15461A3(C2507R.id.comment_editText)).getText().clear();
        int i2 = m15463e4().f26094d.f28987e;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            ((EpoxyRecyclerView) m15461A3(C2507R.id.recycler_view)).m3818s0(0);
        }
        String string = getString(C2507R.string.comment_sent);
        Intrinsics.m32178g(string, "getString(R.string.comment_sent)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: D */
    public void mo14433D() {
        ProgressBar sendProgress = (ProgressBar) m15461A3(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15461A3(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: F */
    public void mo14434F() {
        String string = getString(C2507R.string.comment_deleted);
        Intrinsics.m32178g(string, "getString(R.string.comment_deleted)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: G */
    public void mo14435G() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_comment_vote_banned);
        Intrinsics.m32178g(string, "getString(R.string.error_comment_vote_banned)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: H */
    public void mo14436H() {
        ProgressBar sendProgress = (ProgressBar) m15461A3(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15461A3(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
        Context context = getContext();
        if (context != null) {
            Dialogs dialogs = Dialogs.f30143a;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            String string2 = getString(C2507R.string.error_comment_in_block_list);
            Intrinsics.m32178g(string2, "getString(R.string.error_comment_in_block_list)");
            dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: L0 */
    public void mo14437L0(@NotNull CollectionComment collectionComment) {
        Intrinsics.m32179h(collectionComment, "collectionComment");
        if (m15463e4().m14418c()) {
            Dialogs.f30143a.m16305b(this);
        } else {
            YandexMetrica.reportEvent("Переход в раздел Ответы");
            m15437u3().mo15324d2(CollectionCommentsRepliesFragment.f27934o.m15470b(this.f27915g, collectionComment.getId(), true), null);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: O2 */
    public void mo14438O2(@NotNull CollectionComment collectionComment) {
        CollectionCommentsRepliesFragment m15470b;
        Intrinsics.m32179h(collectionComment, "collectionComment");
        YandexMetrica.reportEvent("Переход в раздел Ответы");
        FragmentNavigation m15437u3 = m15437u3();
        m15470b = CollectionCommentsRepliesFragment.f27934o.m15470b(m15462c4().getId(), collectionComment.getId(), (r12 & 4) != 0 ? false : false);
        m15437u3.mo15324d2(m15470b, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: R0 */
    public void mo14439R0(@NotNull CollectionComment collectionComment) {
        Context context;
        Intrinsics.m32179h(collectionComment, "collectionComment");
        if (collectionComment.getIsDeleted() || (context = getContext()) == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(C2507R.string.show_comment_votes));
        arrayList.add(getString(C2507R.string.copy_comment_message));
        if (collectionComment.getProfile().getId() == m15463e4().m14417b()) {
            arrayList.add(getString(C2507R.string.edit));
        }
        Profile creator = collectionComment.getCollection().getCreator();
        if ((creator != null && creator.getId() == m15463e4().m14417b()) || collectionComment.getProfile().getId() == m15463e4().m14417b()) {
            arrayList.add(getString(C2507R.string.delete));
        }
        if (collectionComment.getProfile().getId() != m15463e4().m14417b()) {
            arrayList.add(getString(C2507R.string.report));
        }
        if (m15463e4().f26092b.m14071n() >= 3 && collectionComment.getProfile().getPrivilegeLevel() <= 1) {
            arrayList.add(getString(C2507R.string.process));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        DialogInterfaceOnClickListenerC2666a dialogInterfaceOnClickListenerC2666a = new DialogInterfaceOnClickListenerC2666a(strArr, this, context, collectionComment, 0);
        AlertController.AlertParams alertParams = builder.f413a;
        alertParams.f388q = strArr;
        alertParams.f390s = dialogInterfaceOnClickListenerC2666a;
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "myBuilder.create()");
        create.show();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: a */
    public void mo14440a() {
        ProgressBar progress_bar = (ProgressBar) m15461A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: b */
    public void mo14441b() {
        ProgressBar progress_bar = (ProgressBar) m15461A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: c */
    public void mo14442c() {
        ((SwipeRefreshLayout) m15461A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15461A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15461A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    @NotNull
    /* renamed from: c4 */
    public final Collection m15462c4() {
        Collection collection = this.f27917i;
        if (collection != null) {
            return collection;
        }
        Intrinsics.m32189r("collection");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: d */
    public void mo14443d() {
        ((SwipeRefreshLayout) m15461A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: d1 */
    public void mo14444d1(@NotNull CollectionComment collectionComment, int i2) {
        Intrinsics.m32179h(collectionComment, "collectionComment");
        m15463e4().m14424j(collectionComment, i2);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: e */
    public void mo14445e() {
        ((SwipeRefreshLayout) m15461A3(C2507R.id.refresh)).setRefreshing(false);
    }

    /* renamed from: e4 */
    public final CollectionCommentsPresenter m15463e4() {
        return (CollectionCommentsPresenter) this.f27914f.getValue(this, f27911m[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: f */
    public void mo14446f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: f0 */
    public void mo14447f0(@NotNull CollectionComment collectionComment) {
        Intrinsics.m32179h(collectionComment, "collectionComment");
        m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(collectionComment, 3), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: l */
    public void mo14448l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f27918j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CollectionCommentsPresenter presenter = m15463e4();
        Intrinsics.m32178g(presenter, "presenter");
        CollectionCommentsUiLogic collectionCommentsUiLogic = presenter.f26094d;
        if (collectionCommentsUiLogic.f28956a) {
            collectionCommentsUiLogic.m15672a();
            CollectionCommentsPresenter.m14416e(presenter, 1, false, false, 4);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: m */
    public void mo14449m() {
        Dialogs.f30143a.m16305b(this);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: n */
    public void mo14450n() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.report_sent);
        Intrinsics.m32178g(string, "getString(R.string.report_sent)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27919k.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: o */
    public void mo14451o() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            builder.m16318j(C2507R.string.error);
            String string = getString(C2507R.string.comment_banned);
            Intrinsics.m32178g(string, "getString(R.string.comment_banned)");
            builder.m16310b(string);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        CollectionCommentsRepliesFragment m15470b;
        App.f25340b.m14043a().mo14108X(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27915g = arguments.getLong("ID_VALUE");
            if (arguments.containsKey("COMMENT_ID_VALUE")) {
                this.f27916h = Long.valueOf(arguments.getLong("COMMENT_ID_VALUE"));
            }
            Serializable serializable = arguments.getSerializable("COLLECTION_VALUE");
            Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Collection");
            this.f27917i = (Collection) serializable;
        }
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
        Long l2 = this.f27916h;
        if (l2 != null) {
            long longValue = l2.longValue();
            YandexMetrica.reportEvent("Переход в раздел Ответы");
            FragmentNavigation m15437u3 = m15437u3();
            m15470b = CollectionCommentsRepliesFragment.f27934o.m15470b(m15462c4().getId(), longValue, (r12 & 4) != 0 ? false : false);
            m15437u3.mo15324d2(m15470b, null);
        }
        CollectionCommentsPresenter m15463e4 = m15463e4();
        long j2 = this.f27915g;
        Collection m15462c4 = m15462c4();
        Objects.requireNonNull(m15463e4);
        CollectionCommentsUiLogic collectionCommentsUiLogic = m15463e4.f26094d;
        Objects.requireNonNull(collectionCommentsUiLogic);
        collectionCommentsUiLogic.f28984b = j2;
        collectionCommentsUiLogic.f28985c = m15462c4;
        collectionCommentsUiLogic.f28956a = true;
        CollectionCommentsPresenter presenter = m15463e4();
        Intrinsics.m32178g(presenter, "presenter");
        CollectionCommentsPresenter.m14416e(presenter, 0, false, false, 7);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_comments, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.b

            /* renamed from: c */
            public final /* synthetic */ CollectionCommentsFragment f28030c;

            {
                this.f28030c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        CollectionCommentsFragment this$0 = this.f28030c;
                        CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final CollectionCommentsFragment this$02 = this.f28030c;
                        CollectionCommentsFragment.Companion companion2 = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15463e4().m14418c()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15463e4().f26094d.f28990h;
                                final int i3 = 0;
                                final int i4 = 1;
                                if (z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                } else if (!z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                }
                                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
                                bottomSheetDialog.setContentView(inflate2);
                                bottomSheetDialog.show();
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i3) {
                                            case 0:
                                                CollectionCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15463e4().f26094d.f28990h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15461A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, i6), 150L);
                                                break;
                                            default:
                                                CollectionCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion4 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15463e4().f26094d.f28990h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15461A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i4) {
                                            case 0:
                                                CollectionCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15463e4().f26094d.f28990h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15461A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, i6), 150L);
                                                break;
                                            default:
                                                CollectionCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion4 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15463e4().f26094d.f28990h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15461A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                        break;
                    default:
                        CollectionCommentsFragment this$03 = this.f28030c;
                        CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15463e4().m14418c()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i3, int i4, @Nullable RecyclerView recyclerView) {
                CollectionCommentsFragment collectionCommentsFragment = CollectionCommentsFragment.this;
                CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
                CollectionCommentsPresenter m15463e4 = collectionCommentsFragment.m15463e4();
                m15463e4.f26094d.f28986d++;
                CollectionCommentsPresenter.m14416e(m15463e4, 0, false, false, 7);
            }
        };
        this.f27918j = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15463e4().f26095e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        final int i3 = 1;
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 13));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) CollectionCommentsFragment.this.m15461A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) CollectionCommentsFragment.this.m15461A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                CollectionCommentsFragment.this.m15464u();
                return Unit.f63088a;
            }
        });
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.sendMsgView);
        Intrinsics.m32178g(linearLayout, "view.sendMsgView");
        ViewsKt.m16373f(linearLayout, m15462c4().getIsPrivate(), false, null, 6);
        ((LinearLayout) inflate.findViewById(C2507R.id.spoilerPanel)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.b

            /* renamed from: c */
            public final /* synthetic */ CollectionCommentsFragment f28030c;

            {
                this.f28030c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        CollectionCommentsFragment this$0 = this.f28030c;
                        CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final CollectionCommentsFragment this$02 = this.f28030c;
                        CollectionCommentsFragment.Companion companion2 = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15463e4().m14418c()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15463e4().f26094d.f28990h;
                                final int i32 = 0;
                                final int i4 = 1;
                                if (z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                } else if (!z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                }
                                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
                                bottomSheetDialog.setContentView(inflate2);
                                bottomSheetDialog.show();
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i32) {
                                            case 0:
                                                CollectionCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15463e4().f26094d.f28990h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15461A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, i6), 150L);
                                                break;
                                            default:
                                                CollectionCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion4 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15463e4().f26094d.f28990h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15461A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i4) {
                                            case 0:
                                                CollectionCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15463e4().f26094d.f28990h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15461A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, i6), 150L);
                                                break;
                                            default:
                                                CollectionCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion4 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15463e4().f26094d.f28990h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15461A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                        break;
                    default:
                        CollectionCommentsFragment this$03 = this.f28030c;
                        CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15463e4().m14418c()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C2507R.id.textViewRules);
        Intrinsics.m32178g(linearLayout2, "view.textViewRules");
        ViewsKt.m16377j(linearLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$onCreateView$7
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnCommentingRules());
                return Unit.f63088a;
            }
        });
        if (m15463e4().m14418c()) {
            ((EditText) inflate.findViewById(C2507R.id.comment_editText)).setInputType(0);
        }
        final int i4 = 2;
        ((EditText) inflate.findViewById(C2507R.id.comment_editText)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.b

            /* renamed from: c */
            public final /* synthetic */ CollectionCommentsFragment f28030c;

            {
                this.f28030c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        CollectionCommentsFragment this$0 = this.f28030c;
                        CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final CollectionCommentsFragment this$02 = this.f28030c;
                        CollectionCommentsFragment.Companion companion2 = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15463e4().m14418c()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15463e4().f26094d.f28990h;
                                final int i32 = 0;
                                final int i42 = 1;
                                if (z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                } else if (!z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                }
                                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
                                bottomSheetDialog.setContentView(inflate2);
                                bottomSheetDialog.show();
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i32) {
                                            case 0:
                                                CollectionCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15463e4().f26094d.f28990h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15461A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, i6), 150L);
                                                break;
                                            default:
                                                CollectionCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion4 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15463e4().f26094d.f28990h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15461A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i42) {
                                            case 0:
                                                CollectionCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15463e4().f26094d.f28990h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15461A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, i6), 150L);
                                                break;
                                            default:
                                                CollectionCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsFragment.Companion companion4 = CollectionCommentsFragment.f27910l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15463e4().f26094d.f28990h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15461A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                        break;
                    default:
                        CollectionCommentsFragment this$03 = this.f28030c;
                        CollectionCommentsFragment.Companion companion3 = CollectionCommentsFragment.f27910l;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15463e4().m14418c()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C2507R.id.send);
        Intrinsics.m32178g(appCompatImageView, "view.send");
        ViewsKt.m16377j(appCompatImageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$onCreateView$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                CollectionCommentsFragment collectionCommentsFragment = CollectionCommentsFragment.this;
                CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
                if (collectionCommentsFragment.m15463e4().m14418c()) {
                    CollectionCommentsFragment collectionCommentsFragment2 = CollectionCommentsFragment.this;
                    Objects.requireNonNull(collectionCommentsFragment2);
                    Dialogs.f30143a.m16305b(collectionCommentsFragment2);
                } else {
                    String obj = ((EditText) CollectionCommentsFragment.this.m15461A3(C2507R.id.comment_editText)).getText().toString();
                    if (obj.length() < 5) {
                        Context context = CollectionCommentsFragment.this.getContext();
                        if (context != null) {
                            CollectionCommentsFragment collectionCommentsFragment3 = CollectionCommentsFragment.this;
                            Dialogs dialogs = Dialogs.f30143a;
                            String string = collectionCommentsFragment3.getString(C2507R.string.error);
                            Intrinsics.m32178g(string, "getString(R.string.error)");
                            String string2 = collectionCommentsFragment3.getString(C2507R.string.comment_is_too_short);
                            Intrinsics.m32178g(string2, "getString(R.string.comment_is_too_short)");
                            dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
                        }
                    } else if (obj.length() > 720) {
                        Context context2 = CollectionCommentsFragment.this.getContext();
                        if (context2 != null) {
                            CollectionCommentsFragment collectionCommentsFragment4 = CollectionCommentsFragment.this;
                            Dialogs dialogs2 = Dialogs.f30143a;
                            String string3 = collectionCommentsFragment4.getString(C2507R.string.error);
                            Intrinsics.m32178g(string3, "getString(R.string.error)");
                            String string4 = collectionCommentsFragment4.getString(C2507R.string.comment_is_too_long);
                            Intrinsics.m32178g(string4, "getString(R.string.comment_is_too_long)");
                            dialogs2.m16306c(context2, string3, string4, (r12 & 8) != 0 ? "Ок" : null, null);
                        }
                    } else {
                        CollectionCommentsFragment.this.m15463e4().m14419d(obj);
                    }
                    Keyboard.f30166a.m16340a(CollectionCommentsFragment.this);
                }
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27919k.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchComment(@NotNull OnFetchCollectionComment onFetchCollectionComment) {
        Intrinsics.m32179h(onFetchCollectionComment, "onFetchCollectionComment");
        m15463e4().m14422h(onFetchCollectionComment.f30188a);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRemoveComment(@NotNull OnRemoveCollectionComment onRemoveCollectionComment) {
        Intrinsics.m32179h(onRemoveCollectionComment, "onRemoveCollectionComment");
        Objects.requireNonNull(m15463e4());
        Intrinsics.m32179h(null, "collectionComment");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: p */
    public void mo14452p() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27912d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: q */
    public void mo14453q() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27912d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: s */
    public void mo14454s() {
        AppCompatImageView send = (AppCompatImageView) m15461A3(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16372e(send);
        ProgressBar sendProgress = (ProgressBar) m15461A3(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16378k(sendProgress);
    }

    /* renamed from: u */
    public final void m15464u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15461A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15461A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f27918j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CollectionCommentsPresenter m15463e4 = m15463e4();
        CollectionCommentsUiLogic collectionCommentsUiLogic = m15463e4.f26094d;
        if (collectionCommentsUiLogic.f28956a) {
            collectionCommentsUiLogic.m15672a();
            CollectionCommentsPresenter.m14416e(m15463e4, 0, false, true, 1);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsView
    /* renamed from: x */
    public void mo14455x() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_comment_negative_vote_limit_reached);
        Intrinsics.m32178g(string, "getString(R.string.error…ative_vote_limit_reached)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (!Intrinsics.m32174c(str, "COMMENT_PROCESS_DIALOG_TAG")) {
            return false;
        }
        long longExtra = intent.getLongExtra("COMMENT_ID_VALUE", 0L);
        String stringExtra = intent.getStringExtra("COMMENT_MESSAGE_VALUE");
        String stringExtra2 = intent.getStringExtra("BAN_REASON_VALUE");
        long longExtra2 = intent.getLongExtra("BAN_EXPIRES_VALUE", 0L);
        boolean booleanExtra = intent.getBooleanExtra("IS_SPOILER_VALUE", false);
        boolean booleanExtra2 = intent.getBooleanExtra("IS_DELETED_VALUE", false);
        boolean booleanExtra3 = intent.getBooleanExtra("IS_BANNED_VALUE", false);
        if (longExtra <= 0 || stringExtra == null) {
            return true;
        }
        m15463e4().m14423i(longExtra, stringExtra, stringExtra2, Long.valueOf(longExtra2), booleanExtra, booleanExtra2, booleanExtra3);
        return true;
    }
}
