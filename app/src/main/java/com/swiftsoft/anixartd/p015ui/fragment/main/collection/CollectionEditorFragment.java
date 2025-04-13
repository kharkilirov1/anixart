package com.swiftsoft.anixartd.p015ui.fragment.main.collection;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.net.UriKt;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.EpoxyTouchHelper;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixart.utils.StringUtils;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionEditorUiController;
import com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionEditorFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.search.SearchFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.create.CollectionEditorUiLogic;
import com.swiftsoft.anixartd.p015ui.model.main.collections.CollectionReleaseEditableModel;
import com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.Keyboard;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnSearchRelease;
import com.swiftsoft.anixartd.utils.OnSoftInputMode;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.cropper.CropImage;
import com.swiftsoft.anixartd.utils.cropper.CropImageOptions;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import com.yandex.mobile.ads.C4632R;
import dagger.Lazy;
import id.zelory.compressor.Compressor;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.FilesKt;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.aprilapps.easyphotopicker.ChooserType;
import pl.aprilapps.easyphotopicker.DefaultCallback;
import pl.aprilapps.easyphotopicker.EasyImage;
import pl.aprilapps.easyphotopicker.MediaFile;
import pl.aprilapps.easyphotopicker.MediaSource;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

/* compiled from: CollectionEditorFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionEditorFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BackPressedListener;", "Lcom/swiftsoft/anixartd/presentation/main/collection/editor/CollectionEditorView;", "", "onChooseImage", "Lcom/swiftsoft/anixartd/utils/OnSearchRelease;", "onSearchRelease", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionEditorFragment extends BaseFragment implements BackPressedListener, CollectionEditorView {

    /* renamed from: d */
    public EasyImage f27963d;

    /* renamed from: e */
    @Inject
    public Lazy<CollectionEditorPresenter> f27964e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27965f;

    /* renamed from: g */
    @Nullable
    public Long f27966g;

    /* renamed from: h */
    public boolean f27967h;

    /* renamed from: i */
    @Nullable
    public String f27968i;

    /* renamed from: j */
    @NotNull
    public Map<Integer, View> f27969j = new LinkedHashMap();

    /* renamed from: l */
    public static final /* synthetic */ KProperty<Object>[] f27961l = {C2052a.m12277l(CollectionEditorFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/collection/editor/CollectionEditorPresenter;", 0)};

    /* renamed from: k */
    @NotNull
    public static final Companion f27960k = new Companion(null);

    /* renamed from: m */
    @NotNull
    public static final String[] f27962m = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* compiled from: CollectionEditorFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/collection/CollectionEditorFragment$Companion;", "", "", "ID_VALUE", "Ljava/lang/String;", "IS_EDIT_MODE_VALUE", "", "RC_STORAGE", "I", "", "STORAGE", "[Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CollectionEditorFragment() {
        Function0<CollectionEditorPresenter> function0 = new Function0<CollectionEditorPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionEditorFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public CollectionEditorPresenter invoke() {
                Lazy<CollectionEditorPresenter> lazy = CollectionEditorFragment.this.f27964e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27965f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(CollectionEditorPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener
    /* renamed from: A2 */
    public boolean mo15435A2() {
        m15473e4();
        return false;
    }

    @Nullable
    /* renamed from: A3 */
    public View m15471A3(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f27969j;
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

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: E1 */
    public void mo14503E1() {
        Dialogs.f30143a.m16308g(this, "Неверное описание коллекции: максимум 1000 символов.", 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: I2 */
    public void mo14504I2() {
        Dialogs.f30143a.m16308g(this, "Выберите хотя бы один релиз", 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: O1 */
    public void mo14505O1() {
        Dialogs.f30143a.m16308g(this, "Вы превысили допустимый лимит релизов в коллекции", 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: O3 */
    public void mo14506O3() {
        Keyboard.f30166a.m16340a(this);
        Dialogs.f30143a.m16308g(this, "Коллекция успешно сохранена", 0);
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: U2 */
    public void mo14507U2() {
        Dialogs.f30143a.m16308g(this, "Выберите обложку коллекции", 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: V0 */
    public void mo14508V0() {
        Dialogs.f30143a.m16308g(this, "Неверное название коллекции: минимум 10 и максимум 60 символов.", 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: a */
    public void mo14509a() {
        ProgressBar progressBarFull = (ProgressBar) m15471A3(C2507R.id.progressBarFull);
        Intrinsics.m32178g(progressBarFull, "progressBarFull");
        ViewsKt.m16372e(progressBarFull);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: b */
    public void mo14510b() {
        ProgressBar progressBarFull = (ProgressBar) m15471A3(C2507R.id.progressBarFull);
        Intrinsics.m32178g(progressBarFull, "progressBarFull");
        ViewsKt.m16378k(progressBarFull);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: b2 */
    public void mo14511b2() {
        Keyboard.f30166a.m16340a(this);
        Dialogs.f30143a.m16308g(this, "Коллекция успешно создана", 0);
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: c */
    public void mo14512c() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.something_went_wrong);
        Intrinsics.m32178g(string, "getString(R.string.something_went_wrong)");
        dialogs.m16308g(this, string, 0);
    }

    /* renamed from: c4 */
    public final CollectionEditorPresenter m15472c4() {
        return (CollectionEditorPresenter) this.f27965f.getValue(this, f27961l[0]);
    }

    /* renamed from: e4 */
    public final void m15473e4() {
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
        builder.f30150b = 3;
        builder.m16318j(C2507R.string.confirm);
        builder.m16310b("Если вы закроете эту страницу, данные сохранены не будут. Вы уверены?");
        builder.m16315g(C2507R.string.yes);
        builder.m16311c(C2507R.string.cancel);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionEditorFragment$onBackDialog$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                CollectionEditorFragment collectionEditorFragment = CollectionEditorFragment.this;
                CollectionEditorFragment.Companion companion = CollectionEditorFragment.f27960k;
                collectionEditorFragment.m15437u3().mo15323a3();
                return Unit.f63088a;
            }
        });
        builder.f30159k = true;
        builder.m16317i();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: m0 */
    public void mo14513m0() {
        m15437u3().mo15324d2(SearchFragment.Companion.m15651a(SearchFragment.f28894p, null, 0, "TAB_HOME", "INNER_TAB_NONE", null, null, this.f27968i, Boolean.TRUE, 49), null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f27969j.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: o */
    public void mo14514o() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            builder.m16318j(C2507R.string.error);
            String string = getString(C2507R.string.collection_banned);
            Intrinsics.m32178g(string, "getString(R.string.collection_banned)");
            builder.m16310b(string);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        Context context;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 203) {
            CropImage.ActivityResult activityResult = intent != null ? (CropImage.ActivityResult) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT") : null;
            if (i3 == -1 && (context = getContext()) != null) {
                Uri resultUri = activityResult.f30407c;
                Intrinsics.m32178g(resultUri, "resultUri");
                File m1939a = UriKt.m1939a(resultUri);
                File m30795a = new Compressor(context).m30795a(m1939a, m1939a.getName());
                if (m30795a.length() <= 1048576) {
                    CollectionEditorPresenter m15472c4 = m15472c4();
                    Objects.requireNonNull(m15472c4);
                    m15472c4.f26181b.f29010i = m30795a;
                    m15472c4.m14495a();
                } else {
                    Dialogs dialogs = Dialogs.f30143a;
                    String string = getString(C2507R.string.error_file_too_large);
                    Intrinsics.m32178g(string, "getString(R.string.error_file_too_large)");
                    dialogs.m16307f(context, string);
                }
            }
        }
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            EasyImage easyImage = this.f27963d;
            if (easyImage != null) {
                easyImage.m34981a(i2, i3, intent, activity, new DefaultCallback() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionEditorFragment$onActivityResult$2$1
                    @Override // pl.aprilapps.easyphotopicker.EasyImage.Callbacks
                    /* renamed from: b */
                    public void mo15474b(@NotNull MediaFile[] mediaFileArr, @NotNull MediaSource mediaSource) {
                        if (!(mediaFileArr.length == 0)) {
                            MediaFile mediaFile = mediaFileArr[0];
                            String m32140a = FilesKt.m32140a(mediaFile.f69350c);
                            int hashCode = m32140a.hashCode();
                            if (hashCode == 105441 ? !m32140a.equals("jpg") : !(hashCode == 111145 ? m32140a.equals("png") : hashCode == 3268712 && m32140a.equals("jpeg"))) {
                                Dialogs dialogs2 = Dialogs.f30143a;
                                FragmentActivity activity2 = activity;
                                Intrinsics.m32178g(activity2, "activity");
                                String string2 = CollectionEditorFragment.this.getString(C2507R.string.error_file_incorrect_format);
                                Intrinsics.m32178g(string2, "getString(R.string.error_file_incorrect_format)");
                                dialogs2.m16307f(activity2, string2);
                                return;
                            }
                            Uri fromFile = Uri.fromFile(mediaFile.f69350c);
                            Intrinsics.m32178g(fromFile, "fromFile(this)");
                            CropImage.ActivityBuilder activityBuilder = new CropImage.ActivityBuilder(fromFile, null);
                            CropImageOptions cropImageOptions = activityBuilder.f30303b;
                            cropImageOptions.f30318A = 480;
                            cropImageOptions.f30319B = 270;
                            cropImageOptions.f30320C = 1920;
                            cropImageOptions.f30321D = 1080;
                            cropImageOptions.f30353n = 16;
                            cropImageOptions.f30354o = 9;
                            cropImageOptions.f30352m = true;
                            cropImageOptions.f30326I = 80;
                            cropImageOptions.f30341b = CropImageView.CropShape.RECTANGLE;
                            activityBuilder.f30303b.f30339V = CollectionEditorFragment.this.getString(C2507R.string.crop_image_save);
                            activityBuilder.m16408a(activity, CollectionEditorFragment.this);
                        }
                    }
                });
            } else {
                Intrinsics.m32189r("easyImage");
                throw null;
            }
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    @AfterPermissionGranted(C4632R.styleable.AppCompatTheme_windowMinWidthMajor)
    public void onChooseImage() {
        Context context = getContext();
        if (context != null) {
            String[] strArr = f27962m;
            if (!EasyPermissions.m34989a(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                EasyPermissions.m34991c(new PermissionRequest.Builder(this, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, (String[]) Arrays.copyOf(strArr, strArr.length)).m34997a());
                return;
            }
            EasyImage easyImage = this.f27963d;
            if (easyImage != null) {
                easyImage.m34984d(this);
            } else {
                Intrinsics.m32189r("easyImage");
                throw null;
            }
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14118d0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27966g = Long.valueOf(arguments.getLong("ID_VALUE"));
            this.f27967h = arguments.getBoolean("IS_EDIT_MODE_VALUE", false);
        }
        this.f27968i = StringUtils.f25336a.m14042a(10);
        Context context = getContext();
        if (context != null) {
            EasyImage.Builder builder = new EasyImage.Builder(context);
            builder.f69343c = ChooserType.CAMERA_AND_GALLERY;
            this.f27963d = builder.m34985a();
        }
        CollectionEditorPresenter m15472c4 = m15472c4();
        Long l2 = this.f27966g;
        boolean z = this.f27967h;
        CollectionEditorUiLogic collectionEditorUiLogic = m15472c4.f26181b;
        collectionEditorUiLogic.f29003b = l2;
        collectionEditorUiLogic.f29011j = z;
        collectionEditorUiLogic.f28956a = true;
        if (z) {
            return;
        }
        m15472c4.m14495a();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_collection_editor, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.back);
        Intrinsics.m32178g(relativeLayout, "view.back");
        ViewsKt.m16377j(relativeLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionEditorFragment$onCreateView$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                CollectionEditorFragment.this.m15473e4();
                return Unit.f63088a;
            }
        });
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(C2507R.id.create_or_edit);
        Intrinsics.m32178g(relativeLayout2, "view.create_or_edit");
        ViewsKt.m16377j(relativeLayout2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionEditorFragment$onCreateView$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                CollectionEditorFragment collectionEditorFragment = CollectionEditorFragment.this;
                CollectionEditorFragment.Companion companion = CollectionEditorFragment.f27960k;
                collectionEditorFragment.m15472c4().m14496c();
                return Unit.f63088a;
            }
        });
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        epoxyRecyclerView.setLayoutManager(linearLayoutManager);
        epoxyRecyclerView.setController(m15472c4().f26182c);
        CollectionEditorUiController collectionEditorUiController = m15472c4().f26182c;
        EpoxyRecyclerView epoxyRecyclerView2 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(CollectionReleaseEditableModel.class);
        new EpoxyTouchHelper.DragBuilder4(collectionEditorUiController, epoxyRecyclerView2, 196611, CollectionReleaseEditableModel.class, arrayList, null).m4572a(new EpoxyTouchHelper.DragCallbacks<CollectionReleaseEditableModel>(inflate) { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionEditorFragment$onCreateView$4

            /* renamed from: a */
            public final int f27975a;

            {
                this.f27975a = ResourcesCompat.m1731a(CollectionEditorFragment.this.getResources(), C2507R.color.screen_background, inflate.getContext().getTheme());
            }

            @Override // com.airbnb.epoxy.EpoxyTouchHelper.DragCallbacks
            /* renamed from: b */
            public void mo4573b(CollectionReleaseEditableModel collectionReleaseEditableModel, View itemView) {
                CollectionReleaseEditableModel model = collectionReleaseEditableModel;
                Intrinsics.m32179h(model, "model");
                Intrinsics.m32179h(itemView, "itemView");
                itemView.animate().scaleX(1.0f).scaleY(1.0f);
                itemView.setBackgroundColor(0);
            }

            @Override // com.airbnb.epoxy.EpoxyTouchHelper.DragCallbacks
            /* renamed from: c */
            public void mo4574c(CollectionReleaseEditableModel collectionReleaseEditableModel, View itemView, int i2) {
                CollectionReleaseEditableModel model = collectionReleaseEditableModel;
                Intrinsics.m32179h(model, "model");
                Intrinsics.m32179h(itemView, "itemView");
                itemView.setBackgroundColor(this.f27975a);
                itemView.animate().scaleX(1.05f).scaleY(1.05f);
            }

            @Override // com.airbnb.epoxy.EpoxyTouchHelper.DragCallbacks
            /* renamed from: d */
            public void mo4575d(int i2, int i3, CollectionReleaseEditableModel collectionReleaseEditableModel, View itemView) {
                CollectionReleaseEditableModel modelBeingMoved = collectionReleaseEditableModel;
                Intrinsics.m32179h(modelBeingMoved, "modelBeingMoved");
                Intrinsics.m32179h(itemView, "itemView");
                CollectionEditorFragment collectionEditorFragment = CollectionEditorFragment.this;
                CollectionEditorFragment.Companion companion = CollectionEditorFragment.f27960k;
                int i4 = i2 - 1;
                int i5 = i3 - 1;
                CollectionEditorUiLogic collectionEditorUiLogic = collectionEditorFragment.m15472c4().f26181b;
                if (collectionEditorUiLogic.f28956a) {
                    Release release = collectionEditorUiLogic.f29008g.get(i4);
                    List<Release> list = collectionEditorUiLogic.f29008g;
                    list.set(i4, list.get(i5));
                    collectionEditorUiLogic.f29008g.set(i5, release);
                }
            }
        });
        if (!this.f27967h) {
            EpoxyRecyclerView epoxyRecyclerView3 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
            Intrinsics.m32178g(epoxyRecyclerView3, "view.recycler_view");
            epoxyRecyclerView3.setVisibility(0);
        }
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
        this.f27969j.clear();
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.m32179h(permissions, "permissions");
        Intrinsics.m32179h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        EasyPermissions.m34990b(i2, permissions, grantResults, this);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onSearchRelease(@NotNull OnSearchRelease onSearchRelease) {
        Intrinsics.m32179h(onSearchRelease, "onSearchRelease");
        if (Intrinsics.m32174c(onSearchRelease.f30186a, this.f27968i)) {
            CollectionEditorPresenter m15472c4 = m15472c4();
            Release release = onSearchRelease.f30224b;
            Objects.requireNonNull(m15472c4);
            Intrinsics.m32179h(release, "release");
            CollectionEditorUiLogic collectionEditorUiLogic = m15472c4.f26181b;
            if (collectionEditorUiLogic.f28956a) {
                Iterator<Release> it = collectionEditorUiLogic.f29008g.iterator();
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
                if (i2 < 0) {
                    collectionEditorUiLogic.f29008g.add(0, release);
                    collectionEditorUiLogic.f29009h++;
                } else {
                    collectionEditorUiLogic.f29008g.set(i2, release);
                }
                m15472c4.m14495a();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        if (this.f27967h && bundle == null) {
            CollectionEditorPresenter presenter = m15472c4();
            Intrinsics.m32178g(presenter, "presenter");
            CollectionEditorPresenter.m14494b(presenter, false, 1);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.collection.editor.CollectionEditorView
    /* renamed from: v3 */
    public void mo14515v3() {
        Dialogs.f30143a.m16308g(this, "Вы превысили допустимый еженедельный лимит по созданию коллекций. Попробуйте позже.", 0);
    }
}
