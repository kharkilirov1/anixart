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
import androidx.room.util.C0576a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.ViewOnClickListenerC1394a;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.CollectionCommentsRepliesUiLogic;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.Keyboard;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnCommentingRules;
import com.swiftsoft.anixartd.utils.OnFetchCollectionComment;
import com.swiftsoft.anixartd.utils.OnSnackbar;
import com.swiftsoft.anixartd.utils.OnSoftInputMode;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
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

/* compiled from: CollectionCommentsRepliesFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionCommentsRepliesFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/collection/comments/replies/CollectionCommentsRepliesView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnFetchCollectionComment;", "onFetchCollectionComment", "", "onFetchComment", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionCommentsRepliesFragment extends BaseFragment implements CollectionCommentsRepliesView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: e */
    @Inject
    public Lazy<CollectionCommentsRepliesPresenter> f27937e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27938f;

    /* renamed from: g */
    public long f27939g;

    /* renamed from: h */
    public long f27940h;

    /* renamed from: i */
    @Nullable
    public Long f27941i;

    /* renamed from: j */
    public boolean f27942j;

    /* renamed from: k */
    public boolean f27943k;

    /* renamed from: l */
    public boolean f27944l;

    /* renamed from: m */
    public EndlessRecyclerViewScrollListener f27945m;

    /* renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f27935p = {C2052a.m12277l(CollectionCommentsRepliesFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/collection/comments/replies/CollectionCommentsRepliesPresenter;", 0)};

    /* renamed from: o */
    @NotNull
    public static final Companion f27934o = new Companion(null);

    /* renamed from: n */
    @NotNull
    public Map<Integer, View> f27946n = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27936d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = CollectionCommentsRepliesFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: CollectionCommentsRepliesFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionCommentsRepliesFragment$Companion;", "", "", "COMMENT_ID_VALUE", "Ljava/lang/String;", "COMMENT_PROCESS_DIALOG_TAG", "ID_VALUE", "IS_DIRECT_LOAD", "IS_REPLY_VALUE", "PARENT_COMMENT_ID_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final CollectionCommentsRepliesFragment m15469a(long j2, long j3, @Nullable Long l2, boolean z) {
            CollectionCommentsRepliesFragment collectionCommentsRepliesFragment = new CollectionCommentsRepliesFragment();
            Bundle m4108g = C0576a.m4108g("ID_VALUE", j2);
            m4108g.putLong("PARENT_COMMENT_ID_VALUE", j3);
            if (l2 != null) {
                m4108g.putLong("COMMENT_ID_VALUE", l2.longValue());
            }
            m4108g.putBoolean("IS_DIRECT_LOAD", z);
            collectionCommentsRepliesFragment.setArguments(m4108g);
            return collectionCommentsRepliesFragment;
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public final CollectionCommentsRepliesFragment m15470b(long j2, long j3, boolean z) {
            CollectionCommentsRepliesFragment collectionCommentsRepliesFragment = new CollectionCommentsRepliesFragment();
            Bundle m4108g = C0576a.m4108g("ID_VALUE", j2);
            m4108g.putLong("PARENT_COMMENT_ID_VALUE", j3);
            m4108g.putBoolean("IS_REPLY_VALUE", z);
            collectionCommentsRepliesFragment.setArguments(m4108g);
            return collectionCommentsRepliesFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CollectionCommentsRepliesFragment() {
        Function0<CollectionCommentsRepliesPresenter> function0 = new Function0<CollectionCommentsRepliesPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CollectionCommentsRepliesPresenter invoke() {
                Lazy<CollectionCommentsRepliesPresenter> lazy = CollectionCommentsRepliesFragment.this.f27937e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProviderCollectionComments");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27938f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(CollectionCommentsRepliesPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: A */
    public void mo14467A() {
        ProgressBar sendProgress = (ProgressBar) m15465A3(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15465A3(C2507R.id.send);
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
    public View m15465A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27946n;
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

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: B */
    public void mo14468B() {
        ((TextView) m15465A3(C2507R.id.textViewReply)).setText((CharSequence) null);
        RelativeLayout replyPanel = (RelativeLayout) m15465A3(C2507R.id.replyPanel);
        Intrinsics.m32178g(replyPanel, "replyPanel");
        ViewsKt.m16372e(replyPanel);
        m15466c4().f26137d.f28982k = null;
        ((EditText) m15465A3(C2507R.id.comment_editText)).getText().clear();
        String string = getString(C2507R.string.comment_sent);
        Intrinsics.m32178g(string, "getString(R.string.comment_sent)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: D */
    public void mo14469D() {
        ProgressBar sendProgress = (ProgressBar) m15465A3(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15465A3(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: F */
    public void mo14470F() {
        String string = getString(C2507R.string.comment_deleted);
        Intrinsics.m32178g(string, "getString(R.string.comment_deleted)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: G */
    public void mo14471G() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_comment_vote_banned);
        Intrinsics.m32178g(string, "getString(R.string.error_comment_vote_banned)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: H */
    public void mo14472H() {
        ProgressBar sendProgress = (ProgressBar) m15465A3(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15465A3(C2507R.id.send);
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

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: L0 */
    public void mo14473L0(@NotNull CollectionComment collectionComment) {
        Intrinsics.m32179h(collectionComment, "collectionComment");
        if (m15466c4().m14459c()) {
            Dialogs.f30143a.m16305b(this);
            return;
        }
        m15466c4().f26137d.m15671d();
        Profile profile = collectionComment.getProfile();
        m15466c4().f26137d.f28982k = profile;
        ((TextView) m15465A3(C2507R.id.textViewReply)).setText(profile.getLogin());
        RelativeLayout replyPanel = (RelativeLayout) m15465A3(C2507R.id.replyPanel);
        Intrinsics.m32178g(replyPanel, "replyPanel");
        ViewsKt.m16378k(replyPanel);
        ((EditText) m15465A3(C2507R.id.comment_editText)).setFocusableInTouchMode(true);
        ((EditText) m15465A3(C2507R.id.comment_editText)).requestFocus();
        ((EditText) m15465A3(C2507R.id.comment_editText)).setText(profile.getLogin() + ", ");
        ((EditText) m15465A3(C2507R.id.comment_editText)).setSelection(((EditText) m15465A3(C2507R.id.comment_editText)).getText().length());
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: R0 */
    public void mo14474R0(@NotNull CollectionComment collectionComment) {
        Context context;
        Intrinsics.m32179h(collectionComment, "collectionComment");
        if (collectionComment.getIsDeleted() || (context = getContext()) == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(C2507R.string.show_comment_votes));
        arrayList.add(getString(C2507R.string.copy_comment_message));
        if (collectionComment.getProfile().getId() == m15466c4().m14458b()) {
            arrayList.add(getString(C2507R.string.edit));
        }
        Profile creator = collectionComment.getCollection().getCreator();
        if ((creator != null && creator.getId() == m15466c4().m14458b()) || collectionComment.getProfile().getId() == m15466c4().m14458b()) {
            arrayList.add(getString(C2507R.string.delete));
        }
        if (collectionComment.getProfile().getId() != m15466c4().m14458b()) {
            arrayList.add(getString(C2507R.string.report));
        }
        if (m15466c4().f26135b.m14071n() >= 3 && collectionComment.getProfile().getPrivilegeLevel() <= 1) {
            arrayList.add(getString(C2507R.string.process));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        DialogInterfaceOnClickListenerC2666a dialogInterfaceOnClickListenerC2666a = new DialogInterfaceOnClickListenerC2666a(strArr, this, context, collectionComment, 1);
        AlertController.AlertParams alertParams = builder.f413a;
        alertParams.f388q = strArr;
        alertParams.f390s = dialogInterfaceOnClickListenerC2666a;
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "myBuilder.create()");
        create.show();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: R3 */
    public void mo14475R3(@NotNull CollectionComment parentCollectionComment) {
        Intrinsics.m32179h(parentCollectionComment, "parentCollectionComment");
        LinearLayout sendMsgView = (LinearLayout) m15465A3(C2507R.id.sendMsgView);
        Intrinsics.m32178g(sendMsgView, "sendMsgView");
        ViewsKt.m16373f(sendMsgView, parentCollectionComment.getIsDeleted() || parentCollectionComment.getCollection().getIsPrivate(), false, null, 6);
        if (this.f27942j) {
            this.f27942j = false;
            mo14473L0(parentCollectionComment);
        }
        if (this.f27944l) {
            return;
        }
        this.f27944l = true;
        Long l2 = this.f27941i;
        if (l2 != null) {
            long longValue = l2.longValue();
            Iterator<CollectionComment> it = m15466c4().f26137d.f28979h.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (it.next().getId() == longValue) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            ((EpoxyRecyclerView) m15465A3(C2507R.id.recycler_view)).m3818s0(i2 + 2);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: a */
    public void mo14476a() {
        ProgressBar progress_bar = (ProgressBar) m15465A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: b */
    public void mo14477b() {
        ProgressBar progress_bar = (ProgressBar) m15465A3(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: c */
    public void mo14478c() {
        ((SwipeRefreshLayout) m15465A3(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15465A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15465A3(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    /* renamed from: c4 */
    public final CollectionCommentsRepliesPresenter m15466c4() {
        return (CollectionCommentsRepliesPresenter) this.f27938f.getValue(this, f27935p[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: d */
    public void mo14479d() {
        ((SwipeRefreshLayout) m15465A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: d0 */
    public void mo14480d0(long j2) {
        m15437u3().mo15324d2(CollectionFragment.f27978k.m15478a(j2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: d1 */
    public void mo14481d1(@NotNull CollectionComment collectionComment, int i2) {
        Intrinsics.m32179h(collectionComment, "collectionComment");
        m15466c4().m14465j(collectionComment, i2);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: e */
    public void mo14482e() {
        ((SwipeRefreshLayout) m15465A3(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: f */
    public void mo14483f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: f0 */
    public void mo14484f0(@NotNull CollectionComment collectionComment) {
        Intrinsics.m32179h(collectionComment, "collectionComment");
        m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(collectionComment, 3), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: l */
    public void mo14485l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f27945m;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CollectionCommentsRepliesPresenter presenter = m15466c4();
        Intrinsics.m32178g(presenter, "presenter");
        CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = presenter.f26137d;
        if (collectionCommentsRepliesUiLogic.f28956a) {
            collectionCommentsRepliesUiLogic.m15668a();
            CollectionCommentsRepliesPresenter.m14457i(presenter, 1, false, false, 4);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: m */
    public void mo14486m() {
        Dialogs.f30143a.m16305b(this);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: n */
    public void mo14487n() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.report_sent);
        Intrinsics.m32178g(string, "getString(R.string.report_sent)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27946n.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: o */
    public void mo14488o() {
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
        App.f25340b.m14043a().mo14142p0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27939g = arguments.getLong("ID_VALUE");
            this.f27940h = arguments.getLong("PARENT_COMMENT_ID_VALUE");
            if (arguments.containsKey("COMMENT_ID_VALUE")) {
                this.f27941i = Long.valueOf(arguments.getLong("COMMENT_ID_VALUE"));
            }
            this.f27942j = arguments.getBoolean("IS_REPLY_VALUE");
            this.f27943k = arguments.getBoolean("IS_DIRECT_LOAD");
        }
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
        CollectionCommentsRepliesPresenter m15466c4 = m15466c4();
        long j2 = this.f27939g;
        long j3 = this.f27940h;
        boolean z = this.f27943k;
        CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = m15466c4.f26137d;
        collectionCommentsRepliesUiLogic.f28973b = j2;
        collectionCommentsRepliesUiLogic.f28974c = j3;
        collectionCommentsRepliesUiLogic.f28975d = z;
        collectionCommentsRepliesUiLogic.f28956a = true;
        CollectionCommentsRepliesPresenter presenter = m15466c4();
        Intrinsics.m32178g(presenter, "presenter");
        CollectionCommentsRepliesPresenter.m14457i(presenter, 0, false, false, 7);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_replies, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.e

            /* renamed from: c */
            public final /* synthetic */ CollectionCommentsRepliesFragment f28038c;

            {
                this.f28038c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        CollectionCommentsRepliesFragment this$0 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final CollectionCommentsRepliesFragment this$02 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion2 = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15466c4().m14459c()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15466c4().f26137d.f28983l;
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
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i3) {
                                            case 0:
                                                CollectionCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15466c4().f26137d.f28983l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15465A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, 3), 150L);
                                                break;
                                            default:
                                                CollectionCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion4 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15466c4().f26137d.f28983l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15465A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i4) {
                                            case 0:
                                                CollectionCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15466c4().f26137d.f28983l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15465A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, 3), 150L);
                                                break;
                                            default:
                                                CollectionCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion4 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15466c4().f26137d.f28983l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15465A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, 2), 150L);
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
                        CollectionCommentsRepliesFragment this$03 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15466c4().m14459c()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i3, int i4, @Nullable RecyclerView recyclerView) {
            }
        };
        this.f27945m = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15466c4().f26138e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        final int i3 = 1;
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C0273a(this, 14));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) CollectionCommentsRepliesFragment.this.m15465A3(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) CollectionCommentsRepliesFragment.this.m15465A3(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                CollectionCommentsRepliesFragment.this.m15467u();
                return Unit.f63088a;
            }
        });
        ((RelativeLayout) inflate.findViewById(C2507R.id.replyPanel)).setOnClickListener(new ViewOnClickListenerC1394a(inflate, this, 1));
        ((LinearLayout) inflate.findViewById(C2507R.id.spoilerPanel)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.e

            /* renamed from: c */
            public final /* synthetic */ CollectionCommentsRepliesFragment f28038c;

            {
                this.f28038c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        CollectionCommentsRepliesFragment this$0 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final CollectionCommentsRepliesFragment this$02 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion2 = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15466c4().m14459c()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15466c4().f26137d.f28983l;
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
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i32) {
                                            case 0:
                                                CollectionCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15466c4().f26137d.f28983l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15465A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, 3), 150L);
                                                break;
                                            default:
                                                CollectionCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion4 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15466c4().f26137d.f28983l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15465A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i4) {
                                            case 0:
                                                CollectionCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15466c4().f26137d.f28983l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15465A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, 3), 150L);
                                                break;
                                            default:
                                                CollectionCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion4 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15466c4().f26137d.f28983l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15465A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, 2), 150L);
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
                        CollectionCommentsRepliesFragment this$03 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15466c4().m14459c()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.textViewRules);
        Intrinsics.m32178g(linearLayout, "view.textViewRules");
        ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$onCreateView$8
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnCommentingRules());
                return Unit.f63088a;
            }
        });
        if (m15466c4().m14459c()) {
            ((EditText) inflate.findViewById(C2507R.id.comment_editText)).setInputType(0);
        }
        final int i4 = 2;
        ((EditText) inflate.findViewById(C2507R.id.comment_editText)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.e

            /* renamed from: c */
            public final /* synthetic */ CollectionCommentsRepliesFragment f28038c;

            {
                this.f28038c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        CollectionCommentsRepliesFragment this$0 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final CollectionCommentsRepliesFragment this$02 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion2 = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15466c4().m14459c()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15466c4().f26137d.f28983l;
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
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i32) {
                                            case 0:
                                                CollectionCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15466c4().f26137d.f28983l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15465A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, 3), 150L);
                                                break;
                                            default:
                                                CollectionCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion4 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15466c4().f26137d.f28983l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15465A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i42) {
                                            case 0:
                                                CollectionCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15466c4().f26137d.f28983l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15465A3(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog, 3), 150L);
                                                break;
                                            default:
                                                CollectionCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                CollectionCommentsRepliesFragment.Companion companion4 = CollectionCommentsRepliesFragment.f27934o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15466c4().f26137d.f28983l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15465A3(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2669d(dialog2, 2), 150L);
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
                        CollectionCommentsRepliesFragment this$03 = this.f28038c;
                        CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15466c4().m14459c()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C2507R.id.send);
        Intrinsics.m32178g(appCompatImageView, "view.send");
        ViewsKt.m16377j(appCompatImageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$onCreateView$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                CollectionCommentsRepliesFragment collectionCommentsRepliesFragment = CollectionCommentsRepliesFragment.this;
                CollectionCommentsRepliesFragment.Companion companion = CollectionCommentsRepliesFragment.f27934o;
                if (collectionCommentsRepliesFragment.m15466c4().m14459c()) {
                    CollectionCommentsRepliesFragment collectionCommentsRepliesFragment2 = CollectionCommentsRepliesFragment.this;
                    Objects.requireNonNull(collectionCommentsRepliesFragment2);
                    Dialogs.f30143a.m16305b(collectionCommentsRepliesFragment2);
                } else {
                    String obj = ((EditText) CollectionCommentsRepliesFragment.this.m15465A3(C2507R.id.comment_editText)).getText().toString();
                    if (obj.length() < 5) {
                        Context context = CollectionCommentsRepliesFragment.this.getContext();
                        if (context != null) {
                            CollectionCommentsRepliesFragment collectionCommentsRepliesFragment3 = CollectionCommentsRepliesFragment.this;
                            Dialogs dialogs = Dialogs.f30143a;
                            String string = collectionCommentsRepliesFragment3.getString(C2507R.string.error);
                            Intrinsics.m32178g(string, "getString(R.string.error)");
                            String string2 = collectionCommentsRepliesFragment3.getString(C2507R.string.comment_is_too_short);
                            Intrinsics.m32178g(string2, "getString(R.string.comment_is_too_short)");
                            dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
                        }
                    } else if (obj.length() > 720) {
                        Context context2 = CollectionCommentsRepliesFragment.this.getContext();
                        if (context2 != null) {
                            CollectionCommentsRepliesFragment collectionCommentsRepliesFragment4 = CollectionCommentsRepliesFragment.this;
                            Dialogs dialogs2 = Dialogs.f30143a;
                            String string3 = collectionCommentsRepliesFragment4.getString(C2507R.string.error);
                            Intrinsics.m32178g(string3, "getString(R.string.error)");
                            String string4 = collectionCommentsRepliesFragment4.getString(C2507R.string.comment_is_too_long);
                            Intrinsics.m32178g(string4, "getString(R.string.comment_is_too_long)");
                            dialogs2.m16306c(context2, string3, string4, (r12 & 8) != 0 ? "Ок" : null, null);
                        }
                    } else {
                        CollectionCommentsRepliesFragment.this.m15466c4().m14460d(obj);
                    }
                    Keyboard.f30166a.m16340a(CollectionCommentsRepliesFragment.this);
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
        this.f27946n.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchComment(@NotNull OnFetchCollectionComment onFetchCollectionComment) {
        Intrinsics.m32179h(onFetchCollectionComment, "onFetchCollectionComment");
        m15466c4().m14463g(onFetchCollectionComment.f30188a);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: p */
    public void mo14489p() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27936d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: q */
    public void mo14490q() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27936d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: s */
    public void mo14491s() {
        AppCompatImageView send = (AppCompatImageView) m15465A3(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16372e(send);
        ProgressBar sendProgress = (ProgressBar) m15465A3(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16378k(sendProgress);
    }

    /* renamed from: u */
    public final void m15467u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15465A3(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15465A3(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f27945m;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        CollectionCommentsRepliesPresenter m15466c4 = m15466c4();
        CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = m15466c4.f26137d;
        if (collectionCommentsRepliesUiLogic.f28956a) {
            collectionCommentsRepliesUiLogic.m15668a();
            CollectionCommentsRepliesPresenter.m14457i(m15466c4, 0, false, true, 1);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: v0 */
    public void mo14492v0() {
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesView
    /* renamed from: x */
    public void mo14493x() {
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
        m15466c4().m14464h(longExtra, stringExtra, stringExtra2, Long.valueOf(longExtra2), booleanExtra, booleanExtra2, booleanExtra3);
        return true;
    }
}
