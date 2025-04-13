package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AccessibilityDelegateCompat {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f3569c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f3570a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f3571b;

    public static final class AccessibilityDelegateAdapter extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final AccessibilityDelegateCompat f3572a;

        public AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.f3572a = accessibilityDelegateCompat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3572a.mo2041a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @RequiresApi
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat mo2042b = this.f3572a.mo2042b(view);
            if (mo2042b != null) {
                return (AccessibilityNodeProvider) mo2042b.f3763a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3572a.mo2043c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i2;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            WeakHashMap<View, ViewPropertyAnimatorCompat> weakHashMap = ViewCompat.f3638a;
            Boolean m2243d = new ViewCompat.C02551(C2507R.id.tag_screen_reader_focusable, Boolean.class, 28).m2243d(view);
            boolean z = m2243d != null && m2243d.booleanValue();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z);
            } else {
                accessibilityNodeInfoCompat.m2510p(1, z);
            }
            Boolean m2243d2 = new ViewCompat.C02584(C2507R.id.tag_accessibility_heading, Boolean.class, 28).m2243d(view);
            boolean z2 = m2243d2 != null && m2243d2.booleanValue();
            if (i3 >= 28) {
                accessibilityNodeInfo.setHeading(z2);
            } else {
                accessibilityNodeInfoCompat.m2510p(2, z2);
            }
            CharSequence m2209l = ViewCompat.m2209l(view);
            if (i3 >= 28) {
                accessibilityNodeInfo.setPaneTitle(m2209l);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", m2209l);
            }
            CharSequence m2243d3 = new ViewCompat.C02573(C2507R.id.tag_state_description, CharSequence.class, 64, 30).m2243d(view);
            if (i3 >= 30) {
                accessibilityNodeInfo.setStateDescription(m2243d3);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", m2243d3);
            }
            this.f3572a.mo2044d(view, accessibilityNodeInfoCompat);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(C2507R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                    }
                }
                ClickableSpan[] m2496f = AccessibilityNodeInfoCompat.m2496f(text);
                if (m2496f != null && m2496f.length > 0) {
                    accessibilityNodeInfoCompat.m2502h().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C2507R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(C2507R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(C2507R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i6 = 0; i6 < m2496f.length; i6++) {
                        ClickableSpan clickableSpan = m2496f[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= sparseArray2.size()) {
                                i2 = AccessibilityNodeInfoCompat.f3742d;
                                AccessibilityNodeInfoCompat.f3742d = i2 + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                    i2 = sparseArray2.keyAt(i7);
                                    break;
                                }
                                i7++;
                            }
                        }
                        sparseArray2.put(i2, new WeakReference(m2496f[i6]));
                        ClickableSpan clickableSpan2 = m2496f[i6];
                        Spanned spanned = (Spanned) text;
                        accessibilityNodeInfoCompat.m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        accessibilityNodeInfoCompat.m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        accessibilityNodeInfoCompat.m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        accessibilityNodeInfoCompat.m2498b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    }
                }
            }
            List list = (List) view.getTag(C2507R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                accessibilityNodeInfoCompat.m2497a((AccessibilityNodeInfoCompat.AccessibilityActionCompat) list.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3572a.mo2045e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3572a.mo2046f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f3572a.mo2047g(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f3572a.mo2048h(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3572a.mo2049i(view, accessibilityEvent);
        }
    }

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static AccessibilityNodeProvider m2050a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m2051b(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i2, bundle);
        }
    }

    public AccessibilityDelegateCompat() {
        this(f3569c);
    }

    /* renamed from: a */
    public boolean mo2041a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.f3570a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Nullable
    /* renamed from: b */
    public AccessibilityNodeProviderCompat mo2042b(@NonNull View view) {
        AccessibilityNodeProvider m2050a = Api16Impl.m2050a(this.f3570a, view);
        if (m2050a != null) {
            return new AccessibilityNodeProviderCompat(m2050a);
        }
        return null;
    }

    /* renamed from: c */
    public void mo2043c(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f3570a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo2044d(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
    }

    /* renamed from: e */
    public void mo2045e(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f3570a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo2046f(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.f3570a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2047g(@androidx.annotation.NonNull android.view.View r9, int r10, @androidx.annotation.Nullable android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 2131362956(0x7f0a048c, float:1.8345707E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            r1 = 0
            r2 = 0
        L11:
            int r3 = r0.size()
            if (r2 >= r3) goto L70
            java.lang.Object r3 = r0.get(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
            int r4 = r3.m2516a()
            if (r4 != r10) goto L6d
            androidx.core.view.accessibility.AccessibilityViewCommand r0 = r3.f3760d
            if (r0 == 0) goto L70
            r0 = 0
            java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r2 = r3.f3759c
            if (r2 == 0) goto L66
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L40
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L40
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L40
            androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments r2 = (androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments) r2     // Catch: java.lang.Exception -> L40
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L3e
            goto L65
        L3e:
            r0 = move-exception
            goto L44
        L40:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L44:
            java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments> r4 = r3.f3759c
            if (r4 != 0) goto L4b
            java.lang.String r4 = "null"
            goto L4f
        L4b:
            java.lang.String r4 = r4.getName()
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L65:
            r0 = r2
        L66:
            androidx.core.view.accessibility.AccessibilityViewCommand r2 = r3.f3760d
            boolean r0 = r2.mo2531d(r9, r0)
            goto L71
        L6d:
            int r2 = r2 + 1
            goto L11
        L70:
            r0 = 0
        L71:
            if (r0 != 0) goto L79
            android.view.View$AccessibilityDelegate r0 = r8.f3570a
            boolean r0 = androidx.core.view.AccessibilityDelegateCompat.Api16Impl.m2051b(r0, r9, r10, r11)
        L79:
            if (r0 != 0) goto Lcc
            r2 = 2131361810(0x7f0a0012, float:1.8343383E38)
            if (r10 != r2) goto Lcc
            if (r11 == 0) goto Lcc
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131362957(0x7f0a048d, float:1.834571E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto Lcb
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto Lcb
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto Lc4
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.m2496f(r11)
            r2 = 0
        Lb2:
            if (r11 == 0) goto Lc4
            int r3 = r11.length
            if (r2 >= r3) goto Lc4
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto Lc1
            r11 = 1
            goto Lc5
        Lc1:
            int r2 = r2 + 1
            goto Lb2
        Lc4:
            r11 = 0
        Lc5:
            if (r11 == 0) goto Lcb
            r10.onClick(r9)
            r1 = 1
        Lcb:
            r0 = r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.AccessibilityDelegateCompat.mo2047g(android.view.View, int, android.os.Bundle):boolean");
    }

    /* renamed from: h */
    public void mo2048h(@NonNull View view, int i2) {
        this.f3570a.sendAccessibilityEvent(view, i2);
    }

    /* renamed from: i */
    public void mo2049i(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f3570a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @RestrictTo
    public AccessibilityDelegateCompat(@NonNull View.AccessibilityDelegate accessibilityDelegate) {
        this.f3570a = accessibilityDelegate;
        this.f3571b = new AccessibilityDelegateAdapter(this);
    }
}
