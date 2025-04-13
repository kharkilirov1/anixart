package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {

    /* renamed from: d */
    public static int f3742d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f3743a;

    /* renamed from: b */
    @RestrictTo
    public int f3744b = -1;

    /* renamed from: c */
    public int f3745c = -1;

    public static class AccessibilityActionCompat {

        /* renamed from: e */
        public static final AccessibilityActionCompat f3746e = new AccessibilityActionCompat(1, null);

        /* renamed from: f */
        public static final AccessibilityActionCompat f3747f = new AccessibilityActionCompat(2, null);

        /* renamed from: g */
        public static final AccessibilityActionCompat f3748g;

        /* renamed from: h */
        public static final AccessibilityActionCompat f3749h;

        /* renamed from: i */
        public static final AccessibilityActionCompat f3750i;

        /* renamed from: j */
        public static final AccessibilityActionCompat f3751j;

        /* renamed from: k */
        public static final AccessibilityActionCompat f3752k;

        /* renamed from: l */
        public static final AccessibilityActionCompat f3753l;

        /* renamed from: m */
        public static final AccessibilityActionCompat f3754m;

        /* renamed from: n */
        public static final AccessibilityActionCompat f3755n;

        /* renamed from: o */
        public static final AccessibilityActionCompat f3756o;

        /* renamed from: a */
        public final Object f3757a;

        /* renamed from: b */
        public final int f3758b;

        /* renamed from: c */
        public final Class<? extends AccessibilityViewCommand.CommandArguments> f3759c;

        /* renamed from: d */
        @RestrictTo
        public final AccessibilityViewCommand f3760d;

        static {
            new AccessibilityActionCompat(4, null);
            new AccessibilityActionCompat(8, null);
            f3748g = new AccessibilityActionCompat(16, null);
            new AccessibilityActionCompat(32, null);
            new AccessibilityActionCompat(64, null);
            new AccessibilityActionCompat(128, null);
            new AccessibilityActionCompat(256, null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
            new AccessibilityActionCompat(RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN, null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
            new AccessibilityActionCompat(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE, null, AccessibilityViewCommand.MoveHtmlArguments.class);
            new AccessibilityActionCompat(RecyclerView.ViewHolder.FLAG_MOVED, null, AccessibilityViewCommand.MoveHtmlArguments.class);
            f3749h = new AccessibilityActionCompat(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT, null);
            f3750i = new AccessibilityActionCompat(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST, null);
            new AccessibilityActionCompat(16384, null);
            new AccessibilityActionCompat(32768, null);
            new AccessibilityActionCompat(TextBuffer.MAX_SEGMENT_LEN, null);
            new AccessibilityActionCompat(131072, null, AccessibilityViewCommand.SetSelectionArguments.class);
            f3751j = new AccessibilityActionCompat(PrimitiveArrayBuilder.MAX_CHUNK_SIZE, null);
            f3752k = new AccessibilityActionCompat(524288, null);
            f3753l = new AccessibilityActionCompat(1048576, null);
            new AccessibilityActionCompat(2097152, null, AccessibilityViewCommand.SetTextArguments.class);
            int i2 = Build.VERSION.SDK_INT;
            new AccessibilityActionCompat(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            new AccessibilityActionCompat(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
            f3754m = new AccessibilityActionCompat(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            new AccessibilityActionCompat(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f3755n = new AccessibilityActionCompat(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            new AccessibilityActionCompat(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new AccessibilityActionCompat(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new AccessibilityActionCompat(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f3756o = new AccessibilityActionCompat(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.SetProgressArguments.class);
            new AccessibilityActionCompat(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
            new AccessibilityActionCompat(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new AccessibilityActionCompat(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new AccessibilityActionCompat(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new AccessibilityActionCompat(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public AccessibilityActionCompat(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        /* renamed from: a */
        public int m2516a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3757a).getId();
        }

        /* renamed from: b */
        public CharSequence m2517b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3757a).getLabel();
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.f3757a;
            return obj2 == null ? accessibilityActionCompat.f3757a == null : obj2.equals(accessibilityActionCompat.f3757a);
        }

        public int hashCode() {
            Object obj = this.f3757a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public AccessibilityActionCompat(int i2, CharSequence charSequence, Class<? extends AccessibilityViewCommand.CommandArguments> cls) {
            this(null, i2, null, null, cls);
        }

        public AccessibilityActionCompat(Object obj, int i2, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends AccessibilityViewCommand.CommandArguments> cls) {
            this.f3758b = i2;
            this.f3760d = accessibilityViewCommand;
            if (obj == null) {
                this.f3757a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.f3757a = obj;
            }
            this.f3759c = cls;
        }
    }

    public static class CollectionInfoCompat {

        /* renamed from: a */
        public final Object f3761a;

        public CollectionInfoCompat(Object obj) {
            this.f3761a = obj;
        }

        /* renamed from: a */
        public static CollectionInfoCompat m2518a(int i2, int i3, boolean z, int i4) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4));
        }
    }

    public static class CollectionItemInfoCompat {

        /* renamed from: a */
        public final Object f3762a;

        public CollectionItemInfoCompat(Object obj) {
            this.f3762a = obj;
        }

        /* renamed from: a */
        public static CollectionItemInfoCompat m2519a(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2));
        }
    }

    public static class RangeInfoCompat {
    }

    public static final class TouchDelegateInfoCompat {
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3743a = accessibilityNodeInfo;
    }

    /* renamed from: c */
    public static String m2495c(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.ViewHolder.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case TextBuffer.MAX_SEGMENT_LEN /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case PrimitiveArrayBuilder.MAX_CHUNK_SIZE /* 262144 */:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    @RestrictTo
    /* renamed from: f */
    public static ClickableSpan[] m2496f(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public void m2497a(AccessibilityActionCompat accessibilityActionCompat) {
        this.f3743a.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f3757a);
    }

    /* renamed from: b */
    public final List<Integer> m2498b(String str) {
        ArrayList<Integer> integerArrayList = this.f3743a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f3743a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public int m2499d() {
        return this.f3743a.getActions();
    }

    /* renamed from: e */
    public CharSequence m2500e() {
        return this.f3743a.getClassName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3743a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f3743a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f3743a)) {
            return false;
        }
        return this.f3745c == accessibilityNodeInfoCompat.f3745c && this.f3744b == accessibilityNodeInfoCompat.f3744b;
    }

    /* renamed from: g */
    public CharSequence m2501g() {
        return this.f3743a.getContentDescription();
    }

    /* renamed from: h */
    public Bundle m2502h() {
        return this.f3743a.getExtras();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3743a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public CharSequence m2503i() {
        return this.f3743a.getPackageName();
    }

    /* renamed from: j */
    public CharSequence m2504j() {
        if (!(!m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f3743a.getText();
        }
        List<Integer> m2498b = m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> m2498b2 = m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> m2498b3 = m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> m2498b4 = m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3743a.getText(), 0, this.f3743a.getText().length()));
        for (int i2 = 0; i2 < m2498b.size(); i2++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(m2498b4.get(i2).intValue(), this, m2502h().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m2498b.get(i2).intValue(), m2498b2.get(i2).intValue(), m2498b3.get(i2).intValue());
        }
        return spannableString;
    }

    /* renamed from: k */
    public boolean m2505k() {
        return this.f3743a.isEnabled();
    }

    /* renamed from: l */
    public boolean m2506l() {
        return this.f3743a.isFocusable();
    }

    /* renamed from: m */
    public boolean m2507m() {
        return this.f3743a.isFocused();
    }

    /* renamed from: n */
    public boolean m2508n() {
        return this.f3743a.isSelected();
    }

    /* renamed from: o */
    public boolean m2509o(AccessibilityActionCompat accessibilityActionCompat) {
        return this.f3743a.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f3757a);
    }

    /* renamed from: p */
    public final void m2510p(int i2, boolean z) {
        Bundle m2502h = m2502h();
        if (m2502h != null) {
            int i3 = m2502h.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z) {
                i2 = 0;
            }
            m2502h.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    /* renamed from: q */
    public void m2511q(Object obj) {
        this.f3743a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((CollectionInfoCompat) obj).f3761a);
    }

    /* renamed from: r */
    public void m2512r(Object obj) {
        this.f3743a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((CollectionItemInfoCompat) obj).f3762a);
    }

    /* renamed from: s */
    public void m2513s(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3743a.setHintText(charSequence);
        } else {
            this.f3743a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: t */
    public void m2514t(View view) {
        this.f3744b = -1;
        this.f3743a.setParent(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @NonNull
    public String toString() {
        ?? emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f3743a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f3743a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m2503i());
        sb.append("; className: ");
        sb.append(m2500e());
        sb.append("; text: ");
        sb.append(m2504j());
        sb.append("; contentDescription: ");
        sb.append(m2501g());
        sb.append("; viewId: ");
        sb.append(this.f3743a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f3743a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f3743a.isChecked());
        sb.append("; focusable: ");
        sb.append(m2506l());
        sb.append("; focused: ");
        sb.append(m2507m());
        sb.append("; selected: ");
        sb.append(m2508n());
        sb.append("; clickable: ");
        sb.append(this.f3743a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f3743a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(m2505k());
        sb.append("; password: ");
        sb.append(this.f3743a.isPassword());
        sb.append("; scrollable: " + this.f3743a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3743a.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                emptyList.add(new AccessibilityActionCompat(actionList.get(i2), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < emptyList.size(); i3++) {
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) emptyList.get(i3);
            String m2495c = m2495c(accessibilityActionCompat.m2516a());
            if (m2495c.equals("ACTION_UNKNOWN") && accessibilityActionCompat.m2517b() != null) {
                m2495c = accessibilityActionCompat.m2517b().toString();
            }
            sb.append(m2495c);
            if (i3 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public void m2515u(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f3743a.setTraversalAfter(view);
        }
    }
}
