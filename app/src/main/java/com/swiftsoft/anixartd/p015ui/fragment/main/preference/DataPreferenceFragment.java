package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.preference.Preference;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.BookmarksImportFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment;
import com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter;
import com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.mobile.ads.C4632R;
import dagger.Lazy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

/* compiled from: DataPreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/DataPreferenceFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BasePreferenceFragment;", "Lcom/swiftsoft/anixartd/presentation/main/preference/DataPreferenceView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "", "onChooseDirectory", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DataPreferenceFragment extends BasePreferenceFragment implements DataPreferenceView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: t */
    public static final /* synthetic */ KProperty<Object>[] f28316t = {C2052a.m12277l(DataPreferenceFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/preference/DataPreferencePresenter;", 0)};

    /* renamed from: u */
    @NotNull
    public static final String[] f28317u = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: p */
    @Inject
    public Lazy<DataPreferencePresenter> f28319p;

    /* renamed from: q */
    @NotNull
    public final MoxyKtxDelegate f28320q;

    /* renamed from: r */
    @NotNull
    public final ActivityResultLauncher<Intent> f28321r;

    /* renamed from: s */
    @NotNull
    public Map<Integer, View> f28322s = new LinkedHashMap();

    /* renamed from: o */
    @NotNull
    public final byte[] f28318o = {ByteSourceJsonBootstrapper.UTF8_BOM_1, ByteSourceJsonBootstrapper.UTF8_BOM_2, ByteSourceJsonBootstrapper.UTF8_BOM_3};

    /* compiled from: DataPreferenceFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/preference/DataPreferenceFragment$Companion;", "", "", "BOOKMARKS_EXPORT_TAG", "Ljava/lang/String;", "BOOKMARKS_IMPORT_TAG", "", "RC_STORAGE", "I", "", "STORAGE", "[Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public DataPreferenceFragment() {
        Function0<DataPreferencePresenter> function0 = new Function0<DataPreferencePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.DataPreferenceFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public DataPreferencePresenter invoke() {
                Lazy<DataPreferencePresenter> lazy = DataPreferenceFragment.this.f28319p;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28320q = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(DataPreferencePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C2700f(this, 2));
        Intrinsics.m32178g(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f28321r = registerForActivityResult;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment
    /* renamed from: A3 */
    public void mo14168A3() {
        this.f28322s.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: R2 */
    public void mo14748R2() {
        new BookmarksImportFragment().show(getChildFragmentManager(), "BOOKMARKS_IMPORT_TAG");
    }

    /* renamed from: e4 */
    public final DataPreferencePresenter m15530e4() {
        return (DataPreferencePresenter) this.f28320q.getValue(this, f28316t[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: i2 */
    public void mo14749i2() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.bookmarks_import_failed);
        Intrinsics.m32178g(string, "getString(R.string.bookmarks_import_failed)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: j2 */
    public void mo14750j2(int i2, @NotNull List<Integer> bookmarksExportProfileLists, @NotNull List<Integer> bookmarksExportExtraFields, @NotNull List<Release> releases) {
        Intrinsics.m32179h(bookmarksExportProfileLists, "bookmarksExportProfileLists");
        Intrinsics.m32179h(bookmarksExportExtraFields, "bookmarksExportExtraFields");
        Intrinsics.m32179h(releases, "releases");
        boolean contains = bookmarksExportProfileLists.contains(0);
        boolean contains2 = bookmarksExportProfileLists.contains(1);
        boolean contains3 = bookmarksExportProfileLists.contains(2);
        boolean contains4 = bookmarksExportProfileLists.contains(3);
        ArrayList arrayList = new ArrayList();
        arrayList.add("#");
        C2052a.m12283r(this, C2507R.string.export_title_ru, "getString(R.string.export_title_ru)", arrayList);
        if (contains) {
            C2052a.m12283r(this, C2507R.string.export_title_original, "getString(R.string.export_title_original)", arrayList);
        }
        if (contains2) {
            C2052a.m12283r(this, C2507R.string.export_title_alt, "getString(R.string.export_title_alt)", arrayList);
        }
        if (contains3) {
            String string = getString(C2507R.string.export_favorite);
            Intrinsics.m32178g(string, "getString(R.string.export_favorite)");
            arrayList.add(string);
            String string2 = getString(C2507R.string.export_profile_list_status);
            Intrinsics.m32178g(string2, "getString(R.string.export_profile_list_status)");
            arrayList.add(string2);
        }
        if (contains4) {
            C2052a.m12283r(this, C2507R.string.export_your_vote, "getString(R.string.export_your_vote)", arrayList);
        }
        ArrayList<List> arrayList2 = new ArrayList();
        boolean z = i2 != 0;
        Iterator it = releases.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            Release release = (Release) it.next();
            ArrayList arrayList3 = new ArrayList();
            int i4 = i3 + 1;
            arrayList3.add(String.valueOf(i3));
            String titleRu = release.getTitleRu();
            Iterator it2 = it;
            if (!(titleRu == null || titleRu.length() == 0)) {
                arrayList3.add(JsonFactory.DEFAULT_QUOTE_CHAR + titleRu + JsonFactory.DEFAULT_QUOTE_CHAR);
            } else if (z) {
                C2052a.m12283r(this, C2507R.string.export_no_title_ru, "getString(R.string.export_no_title_ru)", arrayList3);
            } else {
                C2052a.m12283r(this, C2507R.string.export_no_value, "getString(R.string.export_no_value)", arrayList3);
            }
            if (contains) {
                String titleOriginal = release.getTitleOriginal();
                if (!(titleOriginal == null || titleOriginal.length() == 0)) {
                    arrayList3.add(JsonFactory.DEFAULT_QUOTE_CHAR + titleOriginal + JsonFactory.DEFAULT_QUOTE_CHAR);
                } else if (z) {
                    C2052a.m12283r(this, C2507R.string.export_no_title_original, "getString(R.string.export_no_title_original)", arrayList3);
                } else {
                    C2052a.m12283r(this, C2507R.string.export_no_value, "getString(R.string.export_no_value)", arrayList3);
                }
            }
            if (contains2) {
                String titleAlt = release.getTitleAlt();
                if (!(titleAlt == null || titleAlt.length() == 0)) {
                    StringBuilder m2872a = C0321a.m2872a(JsonFactory.DEFAULT_QUOTE_CHAR);
                    m2872a.append(StringsKt.m33891Q(titleAlt, "\n", ", ", false, 4, null));
                    m2872a.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    arrayList3.add(m2872a.toString());
                } else if (z) {
                    C2052a.m12283r(this, C2507R.string.export_no_title_alt, "getString(R.string.export_no_title_alt)", arrayList3);
                } else {
                    C2052a.m12283r(this, C2507R.string.export_no_values, "getString(R.string.export_no_values)", arrayList3);
                }
            }
            if (contains3) {
                if (release.getIsFavorite() && z) {
                    C2052a.m12283r(this, C2507R.string.export_added_favorite, "getString(R.string.export_added_favorite)", arrayList3);
                } else if (release.getIsFavorite()) {
                    C2052a.m12283r(this, C2507R.string.export_added, "getString(R.string.export_added)", arrayList3);
                } else if (z) {
                    C2052a.m12283r(this, C2507R.string.export_not_added_favorite, "getString(R.string.export_not_added_favorite)", arrayList3);
                } else {
                    C2052a.m12283r(this, C2507R.string.export_not_added, "getString(R.string.export_not_added)", arrayList3);
                }
                int profileListStatus = release.getProfileListStatus();
                if (profileListStatus == 1) {
                    C2052a.m12283r(this, C2507R.string.list_watching, "getString(R.string.list_watching)", arrayList3);
                } else if (profileListStatus == 2) {
                    C2052a.m12283r(this, C2507R.string.list_plan, "getString(R.string.list_plan)", arrayList3);
                } else if (profileListStatus == 3) {
                    C2052a.m12283r(this, C2507R.string.list_completed, "getString(R.string.list_completed)", arrayList3);
                } else if (profileListStatus == 4) {
                    C2052a.m12283r(this, C2507R.string.list_hold_on, "getString(R.string.list_hold_on)", arrayList3);
                } else if (profileListStatus != 5) {
                    C2052a.m12283r(this, C2507R.string.list_no_watching, "getString(R.string.list_no_watching)", arrayList3);
                } else {
                    C2052a.m12283r(this, C2507R.string.list_dropped, "getString(R.string.list_dropped)", arrayList3);
                }
            }
            if (contains4) {
                Integer yourVote = release.getYourVote();
                if (yourVote != null) {
                    String string3 = getString(C2507R.string.out_count);
                    Intrinsics.m32178g(string3, "getString(R.string.out_count)");
                    String format = String.format(string3, Arrays.copyOf(new Object[]{yourVote, 5}, 2));
                    Intrinsics.m32178g(format, "format(format, *args)");
                    arrayList3.add(format);
                } else {
                    C2052a.m12283r(this, C2507R.string.export_no_your_vote, "getString(R.string.export_no_your_vote)", arrayList3);
                }
            }
            arrayList2.add(arrayList3);
            it = it2;
            i3 = i4;
        }
        String str = "";
        if (i2 == 0) {
            StringBuilder m24u = C0000a.m24u("");
            m24u.append(CollectionsKt.m31989B(arrayList, ",", null, null, 0, null, null, 62, null));
            str = m24u.toString() + '\n';
            for (List list : arrayList2) {
                StringBuilder m24u2 = C0000a.m24u(str);
                m24u2.append(CollectionsKt.m31989B(list, ",", null, null, 0, null, null, 62, null));
                str = m24u2.toString() + '\n';
            }
        } else if (i2 == 1) {
            for (List list2 : arrayList2) {
                StringBuilder m24u3 = C0000a.m24u(str);
                m24u3.append(CollectionsKt.m31989B(list2, " / ", null, null, 0, null, null, 62, null));
                str = m24u3.toString() + '\n';
            }
        }
        m15530e4().f26527c.f29076b = Integer.valueOf(i2);
        m15530e4().f26527c.f29077c = str;
        onChooseDirectory();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: m1 */
    public void mo14751m1() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.bookmarks_import_success);
        Intrinsics.m32178g(string, "getString(R.string.bookmarks_import_success)");
        dialogs.m16308g(this, string, 0);
    }

    /* renamed from: m4 */
    public final void m15531m4() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            C2052a.m12284s(builder, C2507R.string.error, C2507R.string.export_invalid_dir, C2507R.string.ok);
        }
    }

    @Override // com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat
    /* renamed from: n3 */
    public void mo3417n3(@Nullable Bundle bundle, @Nullable String str) {
        App.f25340b.m14043a().mo14136m0(this);
        getMvpDelegate().onCreate(bundle);
        m3418u3(C2507R.xml.preference_data, str);
        Preference mo3340t0 = mo3340t0("bookmarks_import");
        Intrinsics.m32176e(mo3340t0);
        Preference mo3340t02 = mo3340t0("bookmarks_export");
        Intrinsics.m32176e(mo3340t02);
        mo3340t0.f4969g = new C2700f(this, 0);
        mo3340t02.f4969g = new C2700f(this, 1);
    }

    @AfterPermissionGranted(C4632R.styleable.AppCompatTheme_windowMinWidthMajor)
    public final void onChooseDirectory() {
        Context context = getContext();
        if (context != null) {
            String[] strArr = f28317u;
            if (!EasyPermissions.m34989a(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                EasyPermissions.m34991c(new PermissionRequest.Builder(this, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, (String[]) Arrays.copyOf(strArr, strArr.length)).m34997a());
            } else {
                this.f28321r.mo315a(Intent.createChooser(new Intent("android.intent.action.OPEN_DOCUMENT_TREE").addCategory("android.intent.category.DEFAULT"), getString(C2507R.string.export_choose_directory)), null);
            }
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        View inflate = inflater.inflate(C2507R.layout.fragment_preference, viewGroup, false);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ((AppCompatTextView) inflate.findViewById(C2507R.id.title)).setText(getResources().getString(C2507R.string.settings_data));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.resultLayout);
        Intrinsics.m32178g(relativeLayout, "rootView.resultLayout");
        ViewsKt.m16378k(relativeLayout);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2695a(this, 3));
        ((FrameLayout) inflate.findViewById(C2507R.id.fragment_container)).addView(onCreateView);
        return inflate;
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BasePreferenceFragment, com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28322s.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.m32179h(permissions, "permissions");
        Intrinsics.m32179h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        EasyPermissions.m34990b(i2, permissions, grantResults, this);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.preference.DataPreferenceView
    /* renamed from: r1 */
    public void mo14752r1() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            builder.m16318j(C2507R.string.error);
            String string = context.getString(C2507R.string.bookmarks_import_limit_reached);
            Intrinsics.m32178g(string, "getString(R.string.bookmarks_import_limit_reached)");
            builder.m16310b(string);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (!Intrinsics.m32174c(str, "BOOKMARKS_IMPORT_TAG")) {
            if (!Intrinsics.m32174c(str, "BOOKMARKS_EXPORT_TAG")) {
                return false;
            }
            int intExtra = intent.getIntExtra("BOOKMARKS_EXPORT_TYPE_VALUE", 0);
            int intExtra2 = intent.getIntExtra("BOOKMARKS_SELECTED_SORT_VALUE", 0);
            Serializable serializableExtra = intent.getSerializableExtra("BOOKMARKS_EXPORT_PROFILE_LISTS_VALUE");
            ArrayList arrayList = serializableExtra instanceof ArrayList ? (ArrayList) serializableExtra : null;
            Serializable serializableExtra2 = intent.getSerializableExtra("BOOKMARKS_EXTRA_FIELDS_VALUE");
            ArrayList arrayList2 = serializableExtra2 instanceof ArrayList ? (ArrayList) serializableExtra2 : null;
            if (arrayList != null && arrayList2 != null) {
                m15530e4().m14746b(intExtra, intExtra2, arrayList, arrayList2);
            }
            return true;
        }
        String stringExtra = intent.getStringExtra("SELECTED_IMPORTER_NAME_VALUE");
        if (stringExtra == null) {
            return false;
        }
        Serializable serializableExtra3 = intent.getSerializableExtra("STATUS_WATCHING_VALUE");
        HashSet<Long> hashSet = serializableExtra3 instanceof HashSet ? (HashSet) serializableExtra3 : null;
        Serializable serializableExtra4 = intent.getSerializableExtra("STATUS_PLANS_VALUE");
        HashSet<Long> hashSet2 = serializableExtra4 instanceof HashSet ? (HashSet) serializableExtra4 : null;
        Serializable serializableExtra5 = intent.getSerializableExtra("STATUS_COMPLETED_VALUE");
        HashSet<Long> hashSet3 = serializableExtra5 instanceof HashSet ? (HashSet) serializableExtra5 : null;
        Serializable serializableExtra6 = intent.getSerializableExtra("STATUS_DROPPED_VALUE");
        HashSet<Long> hashSet4 = serializableExtra6 instanceof HashSet ? (HashSet) serializableExtra6 : null;
        Serializable serializableExtra7 = intent.getSerializableExtra("STATUS_HOLD_ON_VALUE");
        HashSet<Long> hashSet5 = serializableExtra7 instanceof HashSet ? (HashSet) serializableExtra7 : null;
        if (hashSet == null || hashSet2 == null || hashSet3 == null || hashSet4 == null || hashSet5 == null) {
            return false;
        }
        m15530e4().m14745a(stringExtra, hashSet, hashSet2, hashSet3, hashSet4, hashSet5);
        return true;
    }
}
