package com.swiftsoft.anixartd.p015ui.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import com.swiftsoft.anixartd.utils.radiobutton.types.TwoFieldsRadioButton;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BookmarksExportFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/BookmarksExportFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BookmarksExportFragment extends BaseDialogFragment implements CustomRadioGroup.OnRadioButtonListener {

    /* renamed from: l */
    public static final /* synthetic */ int f27608l = 0;

    /* renamed from: d */
    public int f27609d;

    /* renamed from: e */
    public int f27610e;

    /* renamed from: f */
    public String[] f27611f;

    /* renamed from: g */
    public String[] f27612g;

    /* renamed from: h */
    public boolean[] f27613h;

    /* renamed from: i */
    public ArrayList<Integer> f27614i;

    /* renamed from: j */
    public ArrayList<Integer> f27615j;

    /* renamed from: k */
    @NotNull
    public Map<Integer, View> f27616k = new LinkedHashMap();

    /* compiled from: BookmarksExportFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/BookmarksExportFragment$Companion;", "", "", "BOOKMARKS_EXPORT_PROFILE_LISTS_VALUE", "Ljava/lang/String;", "", "BOOKMARKS_EXPORT_TYPE_CSV", "I", "BOOKMARKS_EXPORT_TYPE_TXT", "BOOKMARKS_EXPORT_TYPE_VALUE", "BOOKMARKS_EXTRA_FIELDS_VALUE", "BOOKMARKS_SELECTED_SORT_VALUE", "CHOOSE_TYPE_CONTINUE_BUTTON", "EXTRA_FIELD_PROFILE_LIST_STATUS", "EXTRA_FIELD_TITLE_ALT", "EXTRA_FIELD_TITLE_ORIGINAL", "EXTRA_FIELD_YOUR_VOTE", "SORT_PROFILE_LIST_STATUS", "SORT_TITLE_RU", "SORT_YOUR_VOTE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27616k.clear();
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup.OnRadioButtonListener
    public void onClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        switch (view.getId()) {
            case C2507R.id.itemBookmarksCsv /* 2131362395 */:
                this.f27609d = 0;
                break;
            case C2507R.id.itemBookmarksTxt /* 2131362396 */:
                this.f27609d = 1;
                break;
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        String[] stringArray = getResources().getStringArray(C2507R.array.profile_lists);
        Intrinsics.m32178g(stringArray, "resources.getStringArray(R.array.profile_lists)");
        this.f27611f = stringArray;
        String[] stringArray2 = getResources().getStringArray(C2507R.array.profile_lists_values);
        Intrinsics.m32178g(stringArray2, "resources.getStringArray…ray.profile_lists_values)");
        this.f27612g = stringArray2;
        String[] strArr = this.f27611f;
        if (strArr == null) {
            Intrinsics.m32189r("profileLists");
            throw null;
        }
        this.f27613h = new boolean[strArr.length];
        this.f27614i = new ArrayList<>();
        this.f27615j = new ArrayList<>();
        if (bundle != null) {
            this.f27609d = bundle.getInt("BOOKMARKS_EXPORT_TYPE_VALUE");
            this.f27610e = bundle.getInt("BOOKMARKS_SELECTED_SORT_VALUE", 0);
            Serializable serializable = bundle.getSerializable("BOOKMARKS_EXPORT_PROFILE_LISTS_VALUE");
            ArrayList<Integer> arrayList = serializable instanceof ArrayList ? (ArrayList) serializable : null;
            if (arrayList != null) {
                this.f27614i = arrayList;
            }
            Serializable serializable2 = bundle.getSerializable("BOOKMARKS_EXTRA_FIELDS_VALUE");
            ArrayList<Integer> arrayList2 = serializable2 instanceof ArrayList ? (ArrayList) serializable2 : null;
            if (arrayList2 != null) {
                this.f27615j = arrayList2;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @SuppressLint
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            final View inflate = layoutInflater.inflate(C2507R.layout.dialog_bookmarks_export, (ViewGroup) null);
            int i2 = this.f27609d;
            if (i2 == 0) {
                CustomRadioGroup customRadioGroup = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemBookmarksCsv);
                Intrinsics.m32178g(twoFieldsRadioButton, "view.itemBookmarksCsv");
                customRadioGroup.setSelectedButtonToSelectedState(twoFieldsRadioButton);
            } else if (i2 == 1) {
                CustomRadioGroup customRadioGroup2 = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton2 = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemBookmarksTxt);
                Intrinsics.m32178g(twoFieldsRadioButton2, "view.itemBookmarksTxt");
                customRadioGroup2.setSelectedButtonToSelectedState(twoFieldsRadioButton2);
            }
            ((CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom)).setOnRadioClickListener(this);
            final PopupMenu popupMenu = new PopupMenu(inflate.getContext(), (LinearLayout) inflate.findViewById(C2507R.id.spinner));
            popupMenu.m882a().inflate(C2507R.menu.bookmarks_export_sort, popupMenu.f1394b);
            ((TextView) inflate.findViewById(C2507R.id.selected_sort)).setText(String.valueOf(popupMenu.f1394b.getItem(this.f27610e)));
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.spinner);
            Intrinsics.m32178g(linearLayout, "view.spinner");
            ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.BookmarksExportFragment$onCreateDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view) {
                    View it = view;
                    Intrinsics.m32179h(it, "it");
                    PopupMenu popupMenu2 = PopupMenu.this;
                    final BookmarksExportFragment bookmarksExportFragment = this;
                    final View view2 = inflate;
                    popupMenu2.f1396d = new PopupMenu.OnMenuItemClickListener() { // from class: com.swiftsoft.anixartd.ui.dialog.e
                        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            BookmarksExportFragment this$0 = BookmarksExportFragment.this;
                            View view3 = view2;
                            Intrinsics.m32179h(this$0, "this$0");
                            int itemId = menuItem.getItemId();
                            this$0.f27610e = itemId != C2507R.id.sort_profile_list_status ? itemId != C2507R.id.sort_your_vote ? 0 : 2 : 1;
                            C2052a.m12279n(menuItem, (TextView) view3.findViewById(C2507R.id.selected_sort));
                            return true;
                        }
                    };
                    Context requireContext = bookmarksExportFragment.requireContext();
                    MenuBuilder menuBuilder = PopupMenu.this.f1394b;
                    Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
                    MenuPopupHelper menuPopupHelper = new MenuPopupHelper(requireContext, menuBuilder, (LinearLayout) inflate.findViewById(C2507R.id.spinner));
                    menuPopupHelper.m651e(true);
                    menuPopupHelper.f939g = 8388613;
                    menuPopupHelper.m653g();
                    return Unit.f63088a;
                }
            });
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new ViewOnClickListenerC2646c(inflate, this, 0));
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27616k.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putInt("BOOKMARKS_EXPORT_TYPE_VALUE", this.f27609d);
        outState.putInt("BOOKMARKS_SELECTED_SORT_VALUE", this.f27610e);
        ArrayList<Integer> arrayList = this.f27614i;
        if (arrayList == null) {
            Intrinsics.m32189r("selectionProfileListsValues");
            throw null;
        }
        outState.putSerializable("BOOKMARKS_EXPORT_PROFILE_LISTS_VALUE", arrayList);
        ArrayList<Integer> arrayList2 = this.f27615j;
        if (arrayList2 == null) {
            Intrinsics.m32189r("selectionExtraFields");
            throw null;
        }
        outState.putSerializable("BOOKMARKS_EXTRA_FIELDS_VALUE", arrayList2);
        super.onSaveInstanceState(outState);
    }
}
