package com.swiftsoft.anixartd.p015ui.fragment.main.release;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.google.firebase.components.C2060a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.CommentProcessDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.DialogInterfaceOnClickListenerC2666a;
import com.swiftsoft.anixartd.p015ui.fragment.main.comments.CommentVotesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseCommentsUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter;
import com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.Keyboard;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnCommentingRules;
import com.swiftsoft.anixartd.utils.OnFetchReleaseComment;
import com.swiftsoft.anixartd.utils.OnRemoveReleaseComment;
import com.swiftsoft.anixartd.utils.OnSnackbar;
import com.swiftsoft.anixartd.utils.OnSoftInputMode;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import dagger.Lazy;
import java.io.Serializable;
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
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseCommentsFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000e"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseCommentsFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/release/comments/ReleaseCommentsView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnFetchReleaseComment;", "onFetchReleaseComment", "", "onFetchComment", "Lcom/swiftsoft/anixartd/utils/OnRemoveReleaseComment;", "onRemoveReleaseComment", "onRemoveComment", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCommentsFragment extends BaseFragment implements ReleaseCommentsView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: e */
    @Inject
    public Lazy<ReleaseCommentsPresenter> f28667e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28668f;

    /* renamed from: g */
    public long f28669g;

    /* renamed from: h */
    @Nullable
    public Long f28670h;

    /* renamed from: i */
    public Release f28671i;

    /* renamed from: j */
    public EndlessRecyclerViewScrollListener f28672j;

    /* renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f28665m = {C2052a.m12277l(ReleaseCommentsFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/release/comments/ReleaseCommentsPresenter;", 0)};

    /* renamed from: l */
    @NotNull
    public static final Companion f28664l = new Companion(null);

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f28673k = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f28666d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = ReleaseCommentsFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: ReleaseCommentsFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseCommentsFragment$Companion;", "", "", "COMMENT_ID_VALUE", "Ljava/lang/String;", "COMMENT_PROCESS_DIALOG_TAG", "ID_VALUE", "RELEASE_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final ReleaseCommentsFragment m15609a(long j2, @NotNull Release release) {
            Intrinsics.m32179h(release, "release");
            ReleaseCommentsFragment releaseCommentsFragment = new ReleaseCommentsFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ID_VALUE", j2);
            bundle.putSerializable("RELEASE_VALUE", release);
            releaseCommentsFragment.setArguments(bundle);
            return releaseCommentsFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReleaseCommentsFragment() {
        Function0<ReleaseCommentsPresenter> function0 = new Function0<ReleaseCommentsPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReleaseCommentsPresenter invoke() {
                Lazy<ReleaseCommentsPresenter> lazy = ReleaseCommentsFragment.this.f28667e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProviderRelease");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28668f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReleaseCommentsPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [T, java.lang.String] */
    /* renamed from: A3 */
    public static void m15604A3(String[] items, final ReleaseCommentsFragment this$0, Context it, final ReleaseComment releaseComment, DialogInterface dialogInterface, int i2) {
        Intrinsics.m32179h(items, "$items");
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(it, "$it");
        Intrinsics.m32179h(releaseComment, "$releaseComment");
        String str = items[i2];
        if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.copy_comment_message))) {
            Object systemService = it.getSystemService("clipboard");
            Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", releaseComment.getMessage()));
            Dialogs dialogs = Dialogs.f30143a;
            String string = this$0.getString(C2507R.string.copied);
            Intrinsics.m32178g(string, "getString(R.string.copied)");
            dialogs.m16308g(this$0, string, 0);
            return;
        }
        if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.show_comment_votes))) {
            this$0.m15437u3().mo15324d2(CommentVotesFragment.f28050j.m15490a(releaseComment.getId(), 0), null);
            return;
        }
        if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.edit))) {
            if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.delete))) {
                this$0.m15606e4().m15090e(releaseComment);
                return;
            }
            if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.report))) {
                if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.process))) {
                    CommentProcessDialogFragment.f27708l.m15434a(releaseComment.getId(), releaseComment.getMessage(), releaseComment.getProfile().getBanReason(), Long.valueOf(releaseComment.getProfile().getBanExpires()), releaseComment.getIsSpoiler(), releaseComment.getIsDeleted(), releaseComment.getProfile().getIsBanned()).show(this$0.getChildFragmentManager(), "COMMENT_PROCESS_DIALOG_TAG");
                    return;
                }
                return;
            } else {
                if (this$0.m15606e4().m15088b()) {
                    Dialogs.f30143a.m16305b(this$0);
                    return;
                }
                ReleaseCommentsPresenter m15606e4 = this$0.m15606e4();
                Objects.requireNonNull(m15606e4);
                m15606e4.getViewState().mo15106c0(releaseComment);
                return;
            }
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f63351b = releaseComment.getMessage();
        AlertDialog.Builder builder = new AlertDialog.Builder(it, C2507R.style.DialogTheme);
        final View inflate = this$0.getLayoutInflater().inflate(C2507R.layout.dialog_edit_comment, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog m378l = builder.m378l();
        EditText editText = (EditText) inflate.findViewById(C2507R.id.edit_text);
        editText.setText(releaseComment.getMessage());
        editText.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$onComment$lambda$12$lambda$11$lambda$10$$inlined$addTextChangedListener$default$1
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                Ref.ObjectRef.this.f63351b = String.valueOf(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        ((CheckBox) inflate.findViewById(C2507R.id.cb_is_spoiler)).setChecked(releaseComment.getIsSpoiler());
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
        Intrinsics.m32178g(materialButton, "dialogView.positive_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$onComment$1$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it2 = view;
                Intrinsics.m32179h(it2, "it");
                boolean isChecked = ((CheckBox) inflate.findViewById(C2507R.id.cb_is_spoiler)).isChecked();
                if (objectRef.f63351b.length() < 5) {
                    Dialogs dialogs2 = Dialogs.f30143a;
                    Context context = inflate.getContext();
                    Intrinsics.m32178g(context, "dialogView.context");
                    String string2 = this$0.getString(C2507R.string.error);
                    Intrinsics.m32178g(string2, "getString(R.string.error)");
                    String string3 = this$0.getString(C2507R.string.comment_is_too_short);
                    Intrinsics.m32178g(string3, "getString(R.string.comment_is_too_short)");
                    dialogs2.m16306c(context, string2, string3, (r12 & 8) != 0 ? "Ок" : null, null);
                } else if (objectRef.f63351b.length() > 720) {
                    Dialogs dialogs3 = Dialogs.f30143a;
                    Context context2 = inflate.getContext();
                    Intrinsics.m32178g(context2, "dialogView.context");
                    String string4 = this$0.getString(C2507R.string.error);
                    Intrinsics.m32178g(string4, "getString(R.string.error)");
                    String string5 = this$0.getString(C2507R.string.comment_is_too_long);
                    Intrinsics.m32178g(string5, "getString(R.string.comment_is_too_long)");
                    dialogs3.m16306c(context2, string4, string5, (r12 & 8) != 0 ? "Ок" : null, null);
                } else {
                    m378l.dismiss();
                    releaseComment.setSpoiler(isChecked);
                    ReleaseCommentsFragment releaseCommentsFragment = this$0;
                    ReleaseCommentsFragment.Companion companion = ReleaseCommentsFragment.f28664l;
                    releaseCommentsFragment.m15606e4().m15091f(releaseComment, objectRef.f63351b, isChecked);
                }
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton2, "dialogView.negative_button");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$onComment$1$1$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it2 = view;
                Intrinsics.m32179h(it2, "it");
                AlertDialog.this.dismiss();
                return Unit.f63088a;
            }
        });
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: A */
    public void mo15094A() {
        ProgressBar sendProgress = (ProgressBar) m15605c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15605c4(C2507R.id.send);
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

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: B */
    public void mo15095B() {
        ((EditText) m15605c4(C2507R.id.comment_editText)).getText().clear();
        int i2 = m15606e4().f27039d.f29283e;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            ((EpoxyRecyclerView) m15605c4(C2507R.id.recycler_view)).m3818s0(0);
        }
        String string = getString(C2507R.string.comment_sent);
        Intrinsics.m32178g(string, "getString(R.string.comment_sent)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: D */
    public void mo15096D() {
        ProgressBar sendProgress = (ProgressBar) m15605c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15605c4(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: F */
    public void mo15097F() {
        String string = getString(C2507R.string.comment_deleted);
        Intrinsics.m32178g(string, "getString(R.string.comment_deleted)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: G */
    public void mo15098G() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_comment_vote_banned);
        Intrinsics.m32178g(string, "getString(R.string.error_comment_vote_banned)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: H */
    public void mo15099H() {
        ProgressBar sendProgress = (ProgressBar) m15605c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15605c4(C2507R.id.send);
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

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: U */
    public void mo15100U(@NotNull ReleaseComment releaseComment) {
        Context context;
        Intrinsics.m32179h(releaseComment, "releaseComment");
        if (releaseComment.getIsDeleted() || (context = getContext()) == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(C2507R.string.show_comment_votes));
        arrayList.add(getString(C2507R.string.copy_comment_message));
        if (releaseComment.getProfile().getId() == m15606e4().f27037b.m14061d()) {
            arrayList.add(getString(C2507R.string.edit));
            arrayList.add(getString(C2507R.string.delete));
        }
        if (releaseComment.getProfile().getId() != m15606e4().f27037b.m14061d()) {
            arrayList.add(getString(C2507R.string.report));
        }
        if (m15606e4().f27037b.m14071n() >= 3 && releaseComment.getProfile().getPrivilegeLevel() <= 1) {
            arrayList.add(getString(C2507R.string.process));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        DialogInterfaceOnClickListenerC2666a dialogInterfaceOnClickListenerC2666a = new DialogInterfaceOnClickListenerC2666a(strArr, this, context, releaseComment, 2);
        AlertController.AlertParams alertParams = builder.f413a;
        alertParams.f388q = strArr;
        alertParams.f390s = dialogInterfaceOnClickListenerC2666a;
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "myBuilder.create()");
        create.show();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: W */
    public void mo15101W(@NotNull ReleaseComment releaseComment, int i2) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        m15606e4().m15093h(releaseComment, i2);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: X */
    public void mo15102X(@NotNull ReleaseComment releaseComment) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        if (m15606e4().m15088b()) {
            Dialogs.f30143a.m16305b(this);
        } else {
            YandexMetrica.reportEvent("Переход в раздел Ответы");
            m15437u3().mo15324d2(ReleaseCommentsRepliesFragment.f28688o.m15616b(this.f28669g, releaseComment.getId(), true), null);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: a */
    public void mo15103a() {
        ProgressBar progress_bar = (ProgressBar) m15605c4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: b */
    public void mo15104b() {
        ProgressBar progress_bar = (ProgressBar) m15605c4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: c */
    public void mo15105c() {
        ((SwipeRefreshLayout) m15605c4(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15605c4(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15605c4(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: c0 */
    public void mo15106c0(@NotNull ReleaseComment releaseComment) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(releaseComment, 2), null);
    }

    @Nullable
    /* renamed from: c4 */
    public View m15605c4(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28673k;
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

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: d */
    public void mo15107d() {
        ((SwipeRefreshLayout) m15605c4(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: e */
    public void mo15108e() {
        ((SwipeRefreshLayout) m15605c4(C2507R.id.refresh)).setRefreshing(false);
    }

    /* renamed from: e4 */
    public final ReleaseCommentsPresenter m15606e4() {
        return (ReleaseCommentsPresenter) this.f28668f.getValue(this, f28665m[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: f */
    public void mo15109f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: l */
    public void mo15110l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28672j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ReleaseCommentsPresenter presenter = m15606e4();
        Intrinsics.m32178g(presenter, "presenter");
        ReleaseCommentsUiLogic releaseCommentsUiLogic = presenter.f27039d;
        if (releaseCommentsUiLogic.f28956a) {
            releaseCommentsUiLogic.m15699a();
            ReleaseCommentsPresenter.m15087d(presenter, 1, false, false, 4);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: m */
    public void mo15111m() {
        Dialogs.f30143a.m16305b(this);
    }

    @NotNull
    /* renamed from: m4 */
    public final Release m15607m4() {
        Release release = this.f28671i;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: n */
    public void mo15112n() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.report_sent);
        Intrinsics.m32178g(string, "getString(R.string.report_sent)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28673k.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: o */
    public void mo15113o() {
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
        ReleaseCommentsRepliesFragment m15616b;
        App.f25340b.m14043a().mo14147s(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28669g = arguments.getLong("ID_VALUE");
            if (arguments.containsKey("COMMENT_ID_VALUE")) {
                this.f28670h = Long.valueOf(arguments.getLong("COMMENT_ID_VALUE"));
            }
            Serializable serializable = arguments.getSerializable("RELEASE_VALUE");
            Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
            this.f28671i = (Release) serializable;
        }
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
        Long l2 = this.f28670h;
        if (l2 != null) {
            long longValue = l2.longValue();
            YandexMetrica.reportEvent("Переход в раздел Ответы");
            FragmentNavigation m15437u3 = m15437u3();
            m15616b = ReleaseCommentsRepliesFragment.f28688o.m15616b(m15607m4().getId(), longValue, (r12 & 4) != 0 ? false : false);
            m15437u3.mo15324d2(m15616b, null);
        }
        ReleaseCommentsPresenter m15606e4 = m15606e4();
        long j2 = this.f28669g;
        Release m15607m4 = m15607m4();
        Objects.requireNonNull(m15606e4);
        ReleaseCommentsUiLogic releaseCommentsUiLogic = m15606e4.f27039d;
        Objects.requireNonNull(releaseCommentsUiLogic);
        releaseCommentsUiLogic.f29280b = j2;
        releaseCommentsUiLogic.f29281c = m15607m4;
        releaseCommentsUiLogic.f28956a = true;
        ReleaseCommentsPresenter presenter = m15606e4();
        Intrinsics.m32178g(presenter, "presenter");
        ReleaseCommentsPresenter.m15087d(presenter, 0, false, false, 7);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_comments, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.b

            /* renamed from: c */
            public final /* synthetic */ ReleaseCommentsFragment f28801c;

            {
                this.f28801c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ReleaseCommentsFragment this$0 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final ReleaseCommentsFragment this$02 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion2 = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15606e4().m15088b()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15606e4().f27039d.f29286h;
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
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i3) {
                                            case 0:
                                                ReleaseCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15606e4().f27039d.f29286h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15605c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, i6), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion4 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15606e4().f27039d.f29286h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15605c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i4) {
                                            case 0:
                                                ReleaseCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15606e4().f27039d.f29286h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15605c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, i6), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion4 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15606e4().f27039d.f29286h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15605c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, i5), 150L);
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
                        ReleaseCommentsFragment this$03 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15606e4().m15088b()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i3, int i4, @Nullable RecyclerView recyclerView) {
                ReleaseCommentsFragment releaseCommentsFragment = ReleaseCommentsFragment.this;
                ReleaseCommentsFragment.Companion companion = ReleaseCommentsFragment.f28664l;
                ReleaseCommentsPresenter m15606e4 = releaseCommentsFragment.m15606e4();
                m15606e4.f27039d.f29282d++;
                ReleaseCommentsPresenter.m15087d(m15606e4, 0, false, false, 7);
            }
        };
        this.f28672j = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15606e4().f27040e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        final int i3 = 1;
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2060a(this, i3));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ReleaseCommentsFragment.this.m15605c4(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ReleaseCommentsFragment.this.m15605c4(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ReleaseCommentsFragment.this.m15608u();
                return Unit.f63088a;
            }
        });
        ((LinearLayout) inflate.findViewById(C2507R.id.spoilerPanel)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.b

            /* renamed from: c */
            public final /* synthetic */ ReleaseCommentsFragment f28801c;

            {
                this.f28801c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ReleaseCommentsFragment this$0 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final ReleaseCommentsFragment this$02 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion2 = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15606e4().m15088b()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15606e4().f27039d.f29286h;
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
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i32) {
                                            case 0:
                                                ReleaseCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15606e4().f27039d.f29286h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15605c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, i6), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion4 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15606e4().f27039d.f29286h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15605c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i4) {
                                            case 0:
                                                ReleaseCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15606e4().f27039d.f29286h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15605c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, i6), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion4 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15606e4().f27039d.f29286h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15605c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, i5), 150L);
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
                        ReleaseCommentsFragment this$03 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15606e4().m15088b()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.textViewRules);
        Intrinsics.m32178g(linearLayout, "view.textViewRules");
        ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$onCreateView$7
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnCommentingRules());
                return Unit.f63088a;
            }
        });
        if (m15606e4().m15088b()) {
            ((EditText) inflate.findViewById(C2507R.id.comment_editText)).setInputType(0);
        }
        final int i4 = 2;
        ((EditText) inflate.findViewById(C2507R.id.comment_editText)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.b

            /* renamed from: c */
            public final /* synthetic */ ReleaseCommentsFragment f28801c;

            {
                this.f28801c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        ReleaseCommentsFragment this$0 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final ReleaseCommentsFragment this$02 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion2 = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15606e4().m15088b()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15606e4().f27039d.f29286h;
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
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i32) {
                                            case 0:
                                                ReleaseCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15606e4().f27039d.f29286h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15605c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, i6), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion4 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15606e4().f27039d.f29286h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15605c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, i5), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i5 = 0;
                                        int i6 = 1;
                                        switch (i42) {
                                            case 0:
                                                ReleaseCommentsFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15606e4().f27039d.f29286h = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15605c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, i6), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsFragment.Companion companion4 = ReleaseCommentsFragment.f28664l;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15606e4().f27039d.f29286h = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15605c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, i5), 150L);
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
                        ReleaseCommentsFragment this$03 = this.f28801c;
                        ReleaseCommentsFragment.Companion companion3 = ReleaseCommentsFragment.f28664l;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15606e4().m15088b()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C2507R.id.send);
        Intrinsics.m32178g(appCompatImageView, "view.send");
        ViewsKt.m16377j(appCompatImageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsFragment$onCreateView$9
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ReleaseCommentsFragment releaseCommentsFragment = ReleaseCommentsFragment.this;
                ReleaseCommentsFragment.Companion companion = ReleaseCommentsFragment.f28664l;
                if (releaseCommentsFragment.m15606e4().m15088b()) {
                    ReleaseCommentsFragment releaseCommentsFragment2 = ReleaseCommentsFragment.this;
                    Objects.requireNonNull(releaseCommentsFragment2);
                    Dialogs.f30143a.m16305b(releaseCommentsFragment2);
                } else {
                    String obj = ((EditText) ReleaseCommentsFragment.this.m15605c4(C2507R.id.comment_editText)).getText().toString();
                    if (obj.length() < 5) {
                        Context context = ReleaseCommentsFragment.this.getContext();
                        if (context != null) {
                            ReleaseCommentsFragment releaseCommentsFragment3 = ReleaseCommentsFragment.this;
                            Dialogs dialogs = Dialogs.f30143a;
                            String string = releaseCommentsFragment3.getString(C2507R.string.error);
                            Intrinsics.m32178g(string, "getString(R.string.error)");
                            String string2 = releaseCommentsFragment3.getString(C2507R.string.comment_is_too_short);
                            Intrinsics.m32178g(string2, "getString(R.string.comment_is_too_short)");
                            dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
                        }
                    } else if (obj.length() > 720) {
                        Context context2 = ReleaseCommentsFragment.this.getContext();
                        if (context2 != null) {
                            ReleaseCommentsFragment releaseCommentsFragment4 = ReleaseCommentsFragment.this;
                            Dialogs dialogs2 = Dialogs.f30143a;
                            String string3 = releaseCommentsFragment4.getString(C2507R.string.error);
                            Intrinsics.m32178g(string3, "getString(R.string.error)");
                            String string4 = releaseCommentsFragment4.getString(C2507R.string.comment_is_too_long);
                            Intrinsics.m32178g(string4, "getString(R.string.comment_is_too_long)");
                            dialogs2.m16306c(context2, string3, string4, (r12 & 8) != 0 ? "Ок" : null, null);
                        }
                    } else {
                        ReleaseCommentsFragment.this.m15606e4().m15089c(obj);
                    }
                    Keyboard.f30166a.m16340a(ReleaseCommentsFragment.this);
                }
                return Unit.f63088a;
            }
        });
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28673k.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchComment(@NotNull OnFetchReleaseComment onFetchReleaseComment) {
        boolean z;
        Intrinsics.m32179h(onFetchReleaseComment, "onFetchReleaseComment");
        ReleaseCommentsPresenter m15606e4 = m15606e4();
        ReleaseComment releaseComment = onFetchReleaseComment.f30206a;
        Objects.requireNonNull(m15606e4);
        Intrinsics.m32179h(releaseComment, "releaseComment");
        if (m15606e4.f27039d.f28956a) {
            if (releaseComment.getIsDeleted()) {
                z = m15606e4.f27039d.m15700b(releaseComment);
            } else {
                ReleaseCommentsUiLogic releaseCommentsUiLogic = m15606e4.f27039d;
                Objects.requireNonNull(releaseCommentsUiLogic);
                Iterator<ReleaseComment> it = releaseCommentsUiLogic.f29284f.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (it.next().getId() == releaseComment.getId()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (i2 >= 0) {
                    releaseCommentsUiLogic.f29284f.set(i2, releaseComment);
                }
                z = i2 >= 0;
            }
            if (z) {
                ReleaseCommentsPresenter.m15086a(m15606e4, false, 1);
            }
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRemoveComment(@NotNull OnRemoveReleaseComment onRemoveReleaseComment) {
        Intrinsics.m32179h(onRemoveReleaseComment, "onRemoveReleaseComment");
        Objects.requireNonNull(m15606e4());
        Intrinsics.m32179h(null, "releaseComment");
        throw null;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: p */
    public void mo15114p() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28666d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: q */
    public void mo15115q() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28666d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: s */
    public void mo15116s() {
        AppCompatImageView send = (AppCompatImageView) m15605c4(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16372e(send);
        ProgressBar sendProgress = (ProgressBar) m15605c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16378k(sendProgress);
    }

    /* renamed from: u */
    public final void m15608u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15605c4(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15605c4(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28672j;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ReleaseCommentsPresenter m15606e4 = m15606e4();
        ReleaseCommentsUiLogic releaseCommentsUiLogic = m15606e4.f27039d;
        if (releaseCommentsUiLogic.f28956a) {
            releaseCommentsUiLogic.m15699a();
            ReleaseCommentsPresenter.m15087d(m15606e4, 0, false, true, 1);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: x */
    public void mo15117x() {
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
        m15606e4().m15092g(longExtra, stringExtra, stringExtra2, Long.valueOf(longExtra2), booleanExtra, booleanExtra2, booleanExtra3);
        return true;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsView
    /* renamed from: z0 */
    public void mo15118z0(@NotNull ReleaseComment releaseComment) {
        ReleaseCommentsRepliesFragment m15616b;
        Intrinsics.m32179h(releaseComment, "releaseComment");
        YandexMetrica.reportEvent("Переход в раздел Ответы");
        FragmentNavigation m15437u3 = m15437u3();
        m15616b = ReleaseCommentsRepliesFragment.f28688o.m15616b(m15607m4().getId(), releaseComment.getId(), (r12 & 4) != 0 ? false : false);
        m15437u3.mo15324d2(m15616b, null);
    }
}
