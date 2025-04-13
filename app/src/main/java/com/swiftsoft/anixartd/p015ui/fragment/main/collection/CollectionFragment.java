package com.swiftsoft.anixartd.p015ui.fragment.main.collection;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.p002pm.ShortcutInfoCompat;
import androidx.core.content.p002pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.stfalcon.imageviewer.StfalconImageViewer;
import com.stfalcon.imageviewer.viewer.builder.BuilderData;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionEditorFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.CollectionUiLogic;
import com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.CollectionView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnDeleteFavoriteCollection;
import com.swiftsoft.anixartd.utils.OnFetchCollection;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnSilentRecalculate;
import com.swiftsoft.anixartd.utils.OnUpdateCollectionCommentCount;
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
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CollectionFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/collection/CollectionView;", "Lcom/swiftsoft/anixartd/utils/OnFetchCollection;", "onFetchCollection", "", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "Lcom/swiftsoft/anixartd/utils/OnUpdateCollectionCommentCount;", "onUpdateCollectionCommentCount", "Lcom/swiftsoft/anixartd/utils/OnSilentRecalculate;", "onSilentRecalculate", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionFragment extends BaseFragment implements CollectionView {

    /* renamed from: e */
    @Inject
    public Lazy<CollectionPresenter> f27981e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27982f;

    /* renamed from: g */
    public long f27983g;

    /* renamed from: h */
    @Nullable
    public Collection f27984h;

    /* renamed from: i */
    public EndlessRecyclerViewScrollListener f27985i;

    /* renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f27979l = {C2052a.m12277l(CollectionFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/collection/CollectionPresenter;", 0)};

    /* renamed from: k */
    @NotNull
    public static final Companion f27978k = new Companion(null);

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f27986j = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f27980d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = CollectionFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: CollectionFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionFragment$Companion;", "", "", "COLLECTION_VALUE", "Ljava/lang/String;", "DEEP_LINK_TYPE_COLLECTION", "ID_VALUE", "TYPE_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final CollectionFragment m15478a(long j2) {
            CollectionFragment collectionFragment = new CollectionFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ID_VALUE", j2);
            collectionFragment.setArguments(bundle);
            return collectionFragment;
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public final CollectionFragment m15479b(long j2, @NotNull Collection collection) {
            CollectionFragment collectionFragment = new CollectionFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ID_VALUE", j2);
            bundle.putSerializable("COLLECTION_VALUE", collection);
            collectionFragment.setArguments(bundle);
            return collectionFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CollectionFragment() {
        Function0<CollectionPresenter> function0 = new Function0<CollectionPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CollectionPresenter invoke() {
                Lazy<CollectionPresenter> lazy = CollectionFragment.this.f27981e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27982f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(CollectionPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Nullable
    /* renamed from: A3 */
    public View m15475A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27986j;
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

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: D0 */
    public void mo14391D0() {
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
        builder.f30150b = 3;
        builder.m16319k("Удалить коллекцию?");
        builder.m16310b("Вы уверены, что хотите удалить коллекцию?");
        builder.m16315g(C2507R.string.delete);
        builder.m16311c(C2507R.string.cancel);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$onDelete$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                CollectionFragment collectionFragment = CollectionFragment.this;
                CollectionFragment.Companion companion = CollectionFragment.f27978k;
                collectionFragment.m15476c4().m14379e();
                return Unit.f63088a;
            }
        });
        builder.f30159k = true;
        builder.m16317i();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: E0 */
    public void mo14392E0() {
        FragmentNavigation m15437u3 = m15437u3();
        CollectionEditorFragment.Companion companion = CollectionEditorFragment.f27960k;
        long j2 = this.f27983g;
        Objects.requireNonNull(companion);
        CollectionEditorFragment collectionEditorFragment = new CollectionEditorFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("ID_VALUE", j2);
        bundle.putBoolean("IS_EDIT_MODE_VALUE", true);
        collectionEditorFragment.setArguments(bundle);
        m15437u3.mo15324d2(collectionEditorFragment, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: N3 */
    public void mo14393N3() {
        Dialogs dialogs = Dialogs.f30143a;
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        dialogs.m16306c(requireContext, "Ошибка", "Не удалось добавить на главный экран.", (r12 & 8) != 0 ? "Ок" : null, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: Q0 */
    public void mo14394Q0() {
        Collection m15675b = m15476c4().f26073e.m15675b();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", getString(C2507R.string.share_collection_text, m15675b.getTitle(), Long.valueOf(m15675b.getId())));
        startActivity(Intent.createChooser(intent, getString(C2507R.string.text_share)));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: T1 */
    public void mo14395T1() {
        EventBusKt.m16327a(new OnFetchCollection(m15476c4().f26073e.m15675b()));
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.collection_deleted);
        Intrinsics.m32178g(string, "getString(R.string.collection_deleted)");
        dialogs.m16308g(this, string, 0);
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: W0 */
    public void mo14396W0() {
        m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(m15476c4().f26073e.m15675b(), 1), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: Y */
    public void mo14397Y() {
        m15437u3().mo15324d2(ReleaseFragment.Companion.m15624c(ReleaseFragment.f28714t, true, 4, null, null, Long.valueOf(m15476c4().f26073e.m15675b().getId()), 12), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: Y3 */
    public void mo14398Y3(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        this.f27984h = collection;
        m15477e4(collection);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: a */
    public void mo14399a() {
        ((SwipeRefreshLayout) m15475A3(C2507R.id.refresh)).setEnabled(true);
        ProgressBar progressBarFull = (ProgressBar) m15475A3(C2507R.id.progressBarFull);
        Intrinsics.m32178g(progressBarFull, "progressBarFull");
        ViewsKt.m16372e(progressBarFull);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: b */
    public void mo14400b() {
        ((SwipeRefreshLayout) m15475A3(C2507R.id.refresh)).setEnabled(false);
        if (this.f27984h == null) {
            ProgressBar progressBarFull = (ProgressBar) m15475A3(C2507R.id.progressBarFull);
            Intrinsics.m32178g(progressBarFull, "progressBarFull");
            ViewsKt.m16378k(progressBarFull);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: c */
    public void mo14401c() {
        if (this.f27984h == null) {
            LinearLayout error_layout = (LinearLayout) m15475A3(C2507R.id.error_layout);
            Intrinsics.m32178g(error_layout, "error_layout");
            ViewsKt.m16378k(error_layout);
        }
    }

    /* renamed from: c4 */
    public final CollectionPresenter m15476c4() {
        return (CollectionPresenter) this.f27982f.getValue(this, f27979l[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: d */
    public void mo14402d() {
        ((SwipeRefreshLayout) m15475A3(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: e */
    public void mo14403e() {
        ((SwipeRefreshLayout) m15475A3(C2507R.id.refresh)).setRefreshing(false);
    }

    /* renamed from: e4 */
    public final void m15477e4(Collection collection) {
        final Profile creator = collection.getCreator();
        if (creator == null) {
            return;
        }
        if (collection.getIsPrivate() && creator.getId() != m15476c4().f26071c.m14061d()) {
            mo14408i4();
            return;
        }
        LinearLayout creator_info = (LinearLayout) m15475A3(C2507R.id.creator_info);
        Intrinsics.m32178g(creator_info, "creator_info");
        ViewsKt.m16377j(creator_info, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$onCollectionHeader$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                CollectionFragment collectionFragment = CollectionFragment.this;
                CollectionFragment.Companion companion = CollectionFragment.f27978k;
                collectionFragment.m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, creator.getId(), false, 2), null);
                return Unit.f63088a;
            }
        });
        ((TextView) m15475A3(C2507R.id.creator_nickname)).setText(creator.getLogin());
        AppCompatImageView creator_avatar = (AppCompatImageView) m15475A3(C2507R.id.creator_avatar);
        Intrinsics.m32178g(creator_avatar, "creator_avatar");
        ViewsKt.m16368a(creator_avatar, creator.getAvatar());
        LinearLayout error_private = (LinearLayout) m15475A3(C2507R.id.error_private);
        Intrinsics.m32178g(error_private, "error_private");
        ViewsKt.m16372e(error_private);
        LinearLayout creator_info2 = (LinearLayout) m15475A3(C2507R.id.creator_info);
        Intrinsics.m32178g(creator_info2, "creator_info");
        creator_info2.setVisibility(0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: h */
    public void mo14404h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27980d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: i */
    public void mo14405i(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15626b(release.getId(), release), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: i0 */
    public void mo14406i0() {
        Collection m15675b = m15476c4().f26073e.m15675b();
        YandexMetrica.reportEvent("Переход в раздел Комментарии Коллекции");
        FragmentNavigation m15437u3 = m15437u3();
        CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
        long id2 = m15675b.getId();
        Objects.requireNonNull(companion);
        CollectionCommentsFragment collectionCommentsFragment = new CollectionCommentsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("ID_VALUE", id2);
        bundle.putSerializable("COLLECTION_VALUE", m15675b);
        collectionCommentsFragment.setArguments(bundle);
        m15437u3.mo15324d2(collectionCommentsFragment, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: i3 */
    public void mo14407i3() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.collection_delete_failed);
        Intrinsics.m32178g(string, "getString(R.string.collection_delete_failed)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: i4 */
    public void mo14408i4() {
        final Collection collection = this.f27984h;
        LinearLayout error_private = (LinearLayout) m15475A3(C2507R.id.error_private);
        Intrinsics.m32178g(error_private, "error_private");
        ViewsKt.m16378k(error_private);
        if (collection != null) {
            if (m15476c4().f26071c.m14083z() || !collection.getIsFavorite()) {
                MaterialButton btnEPGoBack = (MaterialButton) m15475A3(C2507R.id.btnEPGoBack);
                Intrinsics.m32178g(btnEPGoBack, "btnEPGoBack");
                ViewsKt.m16378k(btnEPGoBack);
            } else {
                MaterialButton btnRemovePrivateFromFav = (MaterialButton) m15475A3(C2507R.id.btnRemovePrivateFromFav);
                Intrinsics.m32178g(btnRemovePrivateFromFav, "btnRemovePrivateFromFav");
                ViewsKt.m16378k(btnRemovePrivateFromFav);
            }
            MaterialButton btnRemovePrivateFromFav2 = (MaterialButton) m15475A3(C2507R.id.btnRemovePrivateFromFav);
            Intrinsics.m32178g(btnRemovePrivateFromFav2, "btnRemovePrivateFromFav");
            ViewsKt.m16377j(btnRemovePrivateFromFav2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$onCollectionIsPrivate$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    EventBusKt.m16327a(new OnDeleteFavoriteCollection(Collection.this));
                    CollectionFragment collectionFragment = this;
                    CollectionFragment.Companion companion = CollectionFragment.f27978k;
                    collectionFragment.m15437u3().mo15323a3();
                    return Unit.f63088a;
                }
            });
            ((MaterialButton) m15475A3(C2507R.id.btnEPGoBack)).setOnClickListener(new ViewOnClickListenerC2672g(this, 0));
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: j */
    public void mo14409j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f27980d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: j0 */
    public void mo14410j0() {
        final Collection m15675b = m15476c4().f26073e.m15675b();
        Glide.m4872c(getActivity()).m5232g(this).mo4897h().mo4889M(new Common().m16298c(m15675b.getImage(), m15476c4().f26071c.m14082y())).mo5265o(128, 128).mo4892a(RequestOptions.m5298E()).m4885I(new CustomTarget<Bitmap>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$onShortcut$1
            @Override // com.bumptech.glide.request.target.Target
            /* renamed from: c */
            public void mo4877c(Object obj, Transition transition) {
                Bitmap resource = (Bitmap) obj;
                Intrinsics.m32179h(resource, "resource");
                CollectionFragment collectionFragment = CollectionFragment.this;
                Collection collection = m15675b;
                CollectionFragment.Companion companion = CollectionFragment.f27978k;
                Objects.requireNonNull(collectionFragment);
                String title = collection.getTitle().length() > 0 ? collection.getTitle() : "Без названия";
                Context context = collectionFragment.getContext();
                if (context != null) {
                    StringBuilder m24u = C0000a.m24u("collection_");
                    m24u.append(collection.getId());
                    ShortcutInfoCompat.Builder builder = new ShortcutInfoCompat.Builder(context, m24u.toString());
                    builder.f3310a.f3307d = String.valueOf(title);
                    PorterDuff.Mode mode = IconCompat.f3400k;
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.f3402b = resource;
                    builder.f3310a.f3308e = iconCompat;
                    Intent intent = new Intent(context.getApplicationContext(), (Class<?>) MainActivity.class);
                    intent.setAction("android.intent.action.VIEW");
                    intent.setFlags(335560704);
                    intent.putExtra("TYPE_VALUE", "DEEP_LINK_TYPE_COLLECTION");
                    intent.putExtra("ID_VALUE", collectionFragment.f27983g);
                    builder.f3310a.f3306c = new Intent[]{intent};
                    ShortcutInfoCompat m1711a = builder.m1711a();
                    Intrinsics.m32178g(m1711a, "Builder(it, \"collection_…\n                .build()");
                    if (!ShortcutManagerCompat.m1712a(context)) {
                        collectionFragment.mo14393N3();
                        return;
                    }
                    ShortcutManagerCompat.m1713b(context, m1711a, null);
                    if (Build.VERSION.SDK_INT < 26) {
                        Dialogs dialogs = Dialogs.f30143a;
                        String string = collectionFragment.getString(C2507R.string.shortcut_created);
                        Intrinsics.m32178g(string, "getString(R.string.shortcut_created)");
                        dialogs.m16308g(collectionFragment, string, 0);
                    }
                }
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            /* renamed from: f */
            public void mo5292f(@Nullable Drawable drawable) {
                CollectionFragment.this.mo14393N3();
            }

            @Override // com.bumptech.glide.request.target.Target
            /* renamed from: k */
            public void mo5296k(@Nullable Drawable drawable) {
            }
        });
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: m */
    public void mo14411m() {
        Dialogs.f30143a.m16305b(this);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: n */
    public void mo14412n() {
        Dialogs.f30143a.m16308g(this, "Спасибо! Жалоба отправлена.", 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27986j.clear();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.m32179h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction m3024d = fragmentManager.m3024d();
            m3024d.mo2940i(this);
            m3024d.m3116d(this);
            m3024d.mo2936e();
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14099O(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("ID_VALUE")) {
                this.f27983g = arguments.getLong("ID_VALUE");
            }
            if (arguments.containsKey("COLLECTION_VALUE")) {
                Serializable serializable = arguments.getSerializable("COLLECTION_VALUE");
                Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Collection");
                this.f27984h = (Collection) serializable;
            }
        }
        if (bundle == null) {
            CollectionPresenter m15476c4 = m15476c4();
            long j2 = this.f27983g;
            Collection collection = this.f27984h;
            CollectionUiLogic collectionUiLogic = m15476c4.f26073e;
            collectionUiLogic.f28993c = j2;
            collectionUiLogic.f28956a = true;
            if (collection != null) {
                collectionUiLogic.f28992b = collection;
                CollectionPresenter.m14375b(m15476c4, false, false, 3);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable final Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_collection, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2672g(this, 2));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2673h(this));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$onCreateView$3
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$onCreateView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh)).setEnabled(true);
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.error_layout);
                Intrinsics.m32178g(linearLayout, "view.error_layout");
                ViewsKt.m16372e(linearLayout);
                CollectionFragment collectionFragment = this;
                CollectionFragment.Companion companion = CollectionFragment.f27978k;
                CollectionPresenter presenter = collectionFragment.m15476c4();
                Intrinsics.m32178g(presenter, "presenter");
                CollectionPresenter.m14376d(presenter, false, false, 3);
                return Unit.f63088a;
            }
        });
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2672g(this, 3));
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(bundle, layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionFragment$onCreateView$6$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i2, int i3, @Nullable RecyclerView recyclerView) {
                CollectionFragment collectionFragment = this;
                CollectionFragment.Companion companion = CollectionFragment.f27978k;
                CollectionPresenter m15476c4 = collectionFragment.m15476c4();
                m15476c4.f26073e.f28994d++;
                m15476c4.m14380f();
            }
        };
        this.f27985i = endlessRecyclerViewScrollListener;
        if (endlessRecyclerViewScrollListener.f27402c == 0) {
            endlessRecyclerViewScrollListener.f27402c = 2;
        }
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15476c4().f26074f);
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
        this.f27986j.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchCollection(@NotNull OnFetchCollection onFetchCollection) {
        Intrinsics.m32179h(onFetchCollection, "onFetchCollection");
        if (m15476c4().f26073e.f28956a) {
            if (onFetchCollection.f30187a.getId() == m15476c4().f26073e.m15675b().getId()) {
                EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f27985i;
                if (endlessRecyclerViewScrollListener == null) {
                    Intrinsics.m32189r("endlessRecyclerViewScrollListener");
                    throw null;
                }
                endlessRecyclerViewScrollListener.m15320g();
                EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener2 = this.f27985i;
                if (endlessRecyclerViewScrollListener2 == null) {
                    Intrinsics.m32189r("endlessRecyclerViewScrollListener");
                    throw null;
                }
                endlessRecyclerViewScrollListener2.f27402c = 2;
                CollectionPresenter m15476c4 = m15476c4();
                CollectionUiLogic collectionUiLogic = m15476c4.f26073e;
                if (collectionUiLogic.f28956a) {
                    collectionUiLogic.m15674a();
                    CollectionPresenter.m14376d(m15476c4, false, false, 2);
                }
            }
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        CollectionPresenter m15476c4 = m15476c4();
        Release release = onFetchRelease.f30205a;
        Objects.requireNonNull(m15476c4);
        Intrinsics.m32179h(release, "release");
        CollectionUiLogic collectionUiLogic = m15476c4.f26073e;
        if (collectionUiLogic.f28956a) {
            Iterator<Release> it = collectionUiLogic.f29001k.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (it.next().getId() == release.getId()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (i2 >= 0) {
                collectionUiLogic.f29001k.set(i2, release);
            }
            CollectionPresenter.m14375b(m15476c4, false, false, 3);
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f27985i;
        if (endlessRecyclerViewScrollListener != null) {
            endlessRecyclerViewScrollListener.m15319f(outState);
        } else {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSilentRecalculate(@NotNull OnSilentRecalculate onSilentRecalculate) {
        Intrinsics.m32179h(onSilentRecalculate, "onSilentRecalculate");
        CollectionPresenter m15476c4 = m15476c4();
        long j2 = onSilentRecalculate.f30225a;
        int i2 = onSilentRecalculate.f30226b;
        int i3 = onSilentRecalculate.f30227c;
        CollectionUiLogic collectionUiLogic = m15476c4.f26073e;
        if (collectionUiLogic.f28956a) {
            Iterator<Release> it = collectionUiLogic.f29001k.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else {
                    if (it.next().getId() == j2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (i4 >= 0 && i3 != i2) {
                collectionUiLogic.m15676c(i3, 1);
                collectionUiLogic.m15676c(i2, -1);
            }
            CollectionPresenter.m14375b(m15476c4, false, false, 3);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onUpdateCollectionCommentCount(@NotNull OnUpdateCollectionCommentCount onUpdateCollectionCommentCount) {
        Intrinsics.m32179h(onUpdateCollectionCommentCount, "onUpdateCollectionCommentCount");
        CollectionPresenter m15476c4 = m15476c4();
        int i2 = onUpdateCollectionCommentCount.f30230a;
        CollectionUiLogic collectionUiLogic = m15476c4.f26073e;
        if (collectionUiLogic.f28956a) {
            Collection m15675b = collectionUiLogic.m15675b();
            m15675b.setCommentCount(m15675b.getCommentCount() + i2);
            CollectionPresenter.m14375b(m15476c4, false, false, 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        Collection collection = this.f27984h;
        if (collection != null) {
            m15477e4(collection);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: p0 */
    public void mo14413p0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m15476c4().f26073e.m15675b().getImage());
        StfalconImageViewer.Builder builder = new StfalconImageViewer.Builder(getContext(), arrayList, new C2673h(this));
        builder.f25213b.f25267b = 0;
        View view = getView();
        ImageView imageView = view != null ? (ImageView) view.findViewById(C2507R.id.image) : null;
        BuilderData<T> builderData = builder.f25213b;
        builderData.f25272g = imageView;
        builderData.f25269d = false;
        builder.m14018a();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.CollectionView
    /* renamed from: s3 */
    public void mo14414s3() {
        LinearLayout error_deleted = (LinearLayout) m15475A3(C2507R.id.error_deleted);
        Intrinsics.m32178g(error_deleted, "error_deleted");
        ViewsKt.m16378k(error_deleted);
        ((MaterialButton) m15475A3(C2507R.id.btnEDGoBack)).setOnClickListener(new ViewOnClickListenerC2672g(this, 1));
    }
}
