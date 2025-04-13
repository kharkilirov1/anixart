package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
class AppCompatTextHelper {

    /* renamed from: a */
    @NonNull
    public final TextView f1241a;

    /* renamed from: b */
    public TintInfo f1242b;

    /* renamed from: c */
    public TintInfo f1243c;

    /* renamed from: d */
    public TintInfo f1244d;

    /* renamed from: e */
    public TintInfo f1245e;

    /* renamed from: f */
    public TintInfo f1246f;

    /* renamed from: g */
    public TintInfo f1247g;

    /* renamed from: h */
    public TintInfo f1248h;

    /* renamed from: i */
    @NonNull
    public final AppCompatTextViewAutoSizeHelper f1249i;

    /* renamed from: j */
    public int f1250j = 0;

    /* renamed from: k */
    public int f1251k = -1;

    /* renamed from: l */
    public Typeface f1252l;

    /* renamed from: m */
    public boolean f1253m;

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static Drawable[] m797a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m798b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m799c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static Locale m800a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m801a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m802b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m803a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m804b(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m805c(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m806d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static Typeface m807a(Typeface typeface, int i2, boolean z) {
            return Typeface.create(typeface, i2, z);
        }
    }

    public AppCompatTextHelper(@NonNull TextView textView) {
        this.f1241a = textView;
        this.f1249i = new AppCompatTextViewAutoSizeHelper(textView);
    }

    /* renamed from: c */
    public static TintInfo m780c(Context context, AppCompatDrawableManager appCompatDrawableManager, int i2) {
        ColorStateList m731d = appCompatDrawableManager.m731d(context, i2);
        if (m731d == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.f1579d = true;
        tintInfo.f1576a = m731d;
        return tintInfo;
    }

    /* renamed from: a */
    public final void m781a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.m729f(drawable, tintInfo, this.f1241a.getDrawableState());
    }

    /* renamed from: b */
    public void m782b() {
        if (this.f1242b != null || this.f1243c != null || this.f1244d != null || this.f1245e != null) {
            Drawable[] compoundDrawables = this.f1241a.getCompoundDrawables();
            m781a(compoundDrawables[0], this.f1242b);
            m781a(compoundDrawables[1], this.f1243c);
            m781a(compoundDrawables[2], this.f1244d);
            m781a(compoundDrawables[3], this.f1245e);
        }
        if (this.f1246f == null && this.f1247g == null) {
            return;
        }
        Drawable[] m797a = Api17Impl.m797a(this.f1241a);
        m781a(m797a[0], this.f1246f);
        m781a(m797a[2], this.f1247g);
    }

    @Nullable
    /* renamed from: d */
    public ColorStateList m783d() {
        TintInfo tintInfo = this.f1248h;
        if (tintInfo != null) {
            return tintInfo.f1576a;
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public PorterDuff.Mode m784e() {
        TintInfo tintInfo = this.f1248h;
        if (tintInfo != null) {
            return tintInfo.f1577b;
        }
        return null;
    }

    @RestrictTo
    /* renamed from: f */
    public boolean m785f() {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f1249i;
        return appCompatTextViewAutoSizeHelper.m816i() && appCompatTextViewAutoSizeHelper.f1270a != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    @android.annotation.SuppressLint
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m786g(@androidx.annotation.Nullable android.util.AttributeSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.m786g(android.util.AttributeSet, int):void");
    }

    /* renamed from: h */
    public void m787h(Context context, int i2) {
        String m965n;
        ColorStateList m954c;
        ColorStateList m954c2;
        ColorStateList m954c3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C0055R.styleable.f314y);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        if (tintTypedArray.m967p(14)) {
            this.f1241a.setAllCaps(tintTypedArray.m952a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (tintTypedArray.m967p(3) && (m954c3 = tintTypedArray.m954c(3)) != null) {
                this.f1241a.setTextColor(m954c3);
            }
            if (tintTypedArray.m967p(5) && (m954c2 = tintTypedArray.m954c(5)) != null) {
                this.f1241a.setLinkTextColor(m954c2);
            }
            if (tintTypedArray.m967p(4) && (m954c = tintTypedArray.m954c(4)) != null) {
                this.f1241a.setHintTextColor(m954c);
            }
        }
        if (tintTypedArray.m967p(0) && tintTypedArray.m957f(0, -1) == 0) {
            this.f1241a.setTextSize(0, 0.0f);
        }
        m794o(context, tintTypedArray);
        if (i3 >= 26 && tintTypedArray.m967p(13) && (m965n = tintTypedArray.m965n(13)) != null) {
            Api26Impl.m806d(this.f1241a, m965n);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f1252l;
        if (typeface != null) {
            this.f1241a.setTypeface(typeface, this.f1250j);
        }
    }

    /* renamed from: i */
    public void m788i(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        Objects.requireNonNull(text);
        if (i2 >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 + 0 : i3 + 0;
        int i6 = i3 > i4 ? i3 - 0 : i4 + 0;
        int length = text.length();
        if (i5 < 0 || i6 > length) {
            EditorInfoCompat.m2554b(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            EditorInfoCompat.m2554b(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            EditorInfoCompat.m2554b(editorInfo, text, i5, i6);
            return;
        }
        int i8 = i6 - i5;
        int i9 = i8 > 1024 ? 0 : i8;
        int i10 = 2048 - i9;
        int min = Math.min(text.length() - i6, i10 - Math.min(i5, (int) (i10 * 0.8d)));
        int min2 = Math.min(i5, i10 - min);
        int i11 = i5 - min2;
        if (EditorInfoCompat.m2553a(text, i11, 0)) {
            i11++;
            min2--;
        }
        if (EditorInfoCompat.m2553a(text, (i6 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i6, min + i6)) : text.subSequence(i11, min2 + i9 + min + i11);
        int i12 = min2 + 0;
        EditorInfoCompat.m2554b(editorInfo, concat, i12, i9 + i12);
    }

    /* renamed from: j */
    public void m789j(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f1249i;
        if (appCompatTextViewAutoSizeHelper.m816i()) {
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f1279j.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.m817j(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (appCompatTextViewAutoSizeHelper.m814g()) {
                appCompatTextViewAutoSizeHelper.m810a();
            }
        }
    }

    /* renamed from: k */
    public void m790k(@NonNull int[] iArr, int i2) throws IllegalArgumentException {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f1249i;
        if (appCompatTextViewAutoSizeHelper.m816i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f1279j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                appCompatTextViewAutoSizeHelper.f1275f = appCompatTextViewAutoSizeHelper.m811b(iArr2);
                if (!appCompatTextViewAutoSizeHelper.m815h()) {
                    StringBuilder m24u = C0000a.m24u("None of the preset sizes is valid: ");
                    m24u.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(m24u.toString());
                }
            } else {
                appCompatTextViewAutoSizeHelper.f1276g = false;
            }
            if (appCompatTextViewAutoSizeHelper.m814g()) {
                appCompatTextViewAutoSizeHelper.m810a();
            }
        }
    }

    /* renamed from: l */
    public void m791l(int i2) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f1249i;
        if (appCompatTextViewAutoSizeHelper.m816i()) {
            if (i2 == 0) {
                appCompatTextViewAutoSizeHelper.f1270a = 0;
                appCompatTextViewAutoSizeHelper.f1273d = -1.0f;
                appCompatTextViewAutoSizeHelper.f1274e = -1.0f;
                appCompatTextViewAutoSizeHelper.f1272c = -1.0f;
                appCompatTextViewAutoSizeHelper.f1275f = new int[0];
                appCompatTextViewAutoSizeHelper.f1271b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(C0000a.m7d("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f1279j.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.m817j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (appCompatTextViewAutoSizeHelper.m814g()) {
                appCompatTextViewAutoSizeHelper.m810a();
            }
        }
    }

    /* renamed from: m */
    public void m792m(@Nullable ColorStateList colorStateList) {
        if (this.f1248h == null) {
            this.f1248h = new TintInfo();
        }
        TintInfo tintInfo = this.f1248h;
        tintInfo.f1576a = colorStateList;
        tintInfo.f1579d = colorStateList != null;
        this.f1242b = tintInfo;
        this.f1243c = tintInfo;
        this.f1244d = tintInfo;
        this.f1245e = tintInfo;
        this.f1246f = tintInfo;
        this.f1247g = tintInfo;
    }

    /* renamed from: n */
    public void m793n(@Nullable PorterDuff.Mode mode) {
        if (this.f1248h == null) {
            this.f1248h = new TintInfo();
        }
        TintInfo tintInfo = this.f1248h;
        tintInfo.f1577b = mode;
        tintInfo.f1578c = mode != null;
        this.f1242b = tintInfo;
        this.f1243c = tintInfo;
        this.f1244d = tintInfo;
        this.f1245e = tintInfo;
        this.f1246f = tintInfo;
        this.f1247g = tintInfo;
    }

    /* renamed from: o */
    public final void m794o(Context context, TintTypedArray tintTypedArray) {
        String m965n;
        this.f1250j = tintTypedArray.m961j(2, this.f1250j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int m961j = tintTypedArray.m961j(11, -1);
            this.f1251k = m961j;
            if (m961j != -1) {
                this.f1250j = (this.f1250j & 2) | 0;
            }
        }
        if (!tintTypedArray.m967p(10) && !tintTypedArray.m967p(12)) {
            if (tintTypedArray.m967p(1)) {
                this.f1253m = false;
                int m961j2 = tintTypedArray.m961j(1, 1);
                if (m961j2 == 1) {
                    this.f1252l = Typeface.SANS_SERIF;
                    return;
                } else if (m961j2 == 2) {
                    this.f1252l = Typeface.SERIF;
                    return;
                } else {
                    if (m961j2 != 3) {
                        return;
                    }
                    this.f1252l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1252l = null;
        int i3 = tintTypedArray.m967p(12) ? 12 : 10;
        final int i4 = this.f1251k;
        final int i5 = this.f1250j;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.f1241a);
            try {
                Typeface m960i = tintTypedArray.m960i(i3, this.f1250j, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: d */
                    public void mo795d(int i6) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: e */
                    public void mo796e(@NonNull Typeface typeface) {
                        int i6;
                        if (Build.VERSION.SDK_INT >= 28 && (i6 = i4) != -1) {
                            typeface = Api28Impl.m807a(typeface, i6, (i5 & 2) != 0);
                        }
                        AppCompatTextHelper appCompatTextHelper = AppCompatTextHelper.this;
                        WeakReference weakReference2 = weakReference;
                        if (appCompatTextHelper.f1253m) {
                            appCompatTextHelper.f1252l = typeface;
                            TextView textView = (TextView) weakReference2.get();
                            if (textView != null) {
                                if (ViewCompat.m2173M(textView)) {
                                    textView.post(new Runnable(appCompatTextHelper, textView, typeface, appCompatTextHelper.f1250j) { // from class: androidx.appcompat.widget.AppCompatTextHelper.2

                                        /* renamed from: b */
                                        public final /* synthetic */ TextView f1258b;

                                        /* renamed from: c */
                                        public final /* synthetic */ Typeface f1259c;

                                        /* renamed from: d */
                                        public final /* synthetic */ int f1260d;

                                        {
                                            this.f1258b = textView;
                                            this.f1259c = typeface;
                                            this.f1260d = r4;
                                        }

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            this.f1258b.setTypeface(this.f1259c, this.f1260d);
                                        }
                                    });
                                } else {
                                    textView.setTypeface(typeface, appCompatTextHelper.f1250j);
                                }
                            }
                        }
                    }
                });
                if (m960i != null) {
                    if (i2 < 28 || this.f1251k == -1) {
                        this.f1252l = m960i;
                    } else {
                        this.f1252l = Api28Impl.m807a(Typeface.create(m960i, 0), this.f1251k, (this.f1250j & 2) != 0);
                    }
                }
                this.f1253m = this.f1252l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1252l != null || (m965n = tintTypedArray.m965n(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1251k == -1) {
            this.f1252l = Typeface.create(m965n, this.f1250j);
        } else {
            this.f1252l = Api28Impl.m807a(Typeface.create(m965n, 0), this.f1251k, (this.f1250j & 2) != 0);
        }
    }
}
