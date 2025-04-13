package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.ColorUtils;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public final class AppCompatDrawableManager {

    /* renamed from: b */
    public static final PorterDuff.Mode f1164b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static AppCompatDrawableManager f1165c;

    /* renamed from: a */
    public ResourceManagerInternal f1166a;

    /* renamed from: a */
    public static synchronized AppCompatDrawableManager m726a() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            if (f1165c == null) {
                m728e();
            }
            appCompatDrawableManager = f1165c;
        }
        return appCompatDrawableManager;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m727c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter m884h;
        synchronized (AppCompatDrawableManager.class) {
            m884h = ResourceManagerInternal.m884h(i2, mode);
        }
        return m884h;
    }

    /* renamed from: e */
    public static synchronized void m728e() {
        synchronized (AppCompatDrawableManager.class) {
            if (f1165c == null) {
                AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                f1165c = appCompatDrawableManager;
                appCompatDrawableManager.f1166a = ResourceManagerInternal.m883d();
                ResourceManagerInternal resourceManagerInternal = f1165c.f1166a;
                ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks = new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1

                    /* renamed from: a */
                    public final int[] f1167a = {C2507R.drawable.abc_textfield_search_default_mtrl_alpha, C2507R.drawable.abc_textfield_default_mtrl_alpha, C2507R.drawable.abc_ab_share_pack_mtrl_alpha};

                    /* renamed from: b */
                    public final int[] f1168b = {C2507R.drawable.abc_ic_commit_search_api_mtrl_alpha, C2507R.drawable.abc_seekbar_tick_mark_material, C2507R.drawable.abc_ic_menu_share_mtrl_alpha, C2507R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C2507R.drawable.abc_ic_menu_cut_mtrl_alpha, C2507R.drawable.abc_ic_menu_selectall_mtrl_alpha, C2507R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

                    /* renamed from: c */
                    public final int[] f1169c = {C2507R.drawable.abc_textfield_activated_mtrl_alpha, C2507R.drawable.abc_textfield_search_activated_mtrl_alpha, C2507R.drawable.abc_cab_background_top_mtrl_alpha, C2507R.drawable.abc_text_cursor_material, C2507R.drawable.abc_text_select_handle_left_mtrl, C2507R.drawable.abc_text_select_handle_middle_mtrl, C2507R.drawable.abc_text_select_handle_right_mtrl};

                    /* renamed from: d */
                    public final int[] f1170d = {C2507R.drawable.abc_popup_background_mtrl_mult, C2507R.drawable.abc_cab_background_internal_bg, C2507R.drawable.abc_menu_hardkey_panel_mtrl_mult};

                    /* renamed from: e */
                    public final int[] f1171e = {C2507R.drawable.abc_tab_indicator_material, C2507R.drawable.abc_textfield_search_material};

                    /* renamed from: f */
                    public final int[] f1172f = {C2507R.drawable.abc_btn_check_material, C2507R.drawable.abc_btn_radio_material, C2507R.drawable.abc_btn_check_material_anim, C2507R.drawable.abc_btn_radio_material_anim};

                    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /* renamed from: a */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean mo732a(@androidx.annotation.NonNull android.content.Context r7, int r8, @androidx.annotation.NonNull android.graphics.drawable.Drawable r9) {
                        /*
                            r6 = this;
                            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.f1164b
                            int[] r1 = r6.f1167a
                            boolean r1 = r6.m737f(r1, r8)
                            r2 = 16842801(0x1010031, float:2.3693695E-38)
                            r3 = -1
                            r4 = 0
                            r5 = 1
                            if (r1 == 0) goto L16
                            r2 = 2130968833(0x7f040101, float:1.754633E38)
                        L13:
                            r8 = -1
                        L14:
                            r1 = 1
                            goto L46
                        L16:
                            int[] r1 = r6.f1169c
                            boolean r1 = r6.m737f(r1, r8)
                            if (r1 == 0) goto L22
                            r2 = 2130968831(0x7f0400ff, float:1.7546327E38)
                            goto L13
                        L22:
                            int[] r1 = r6.f1170d
                            boolean r1 = r6.m737f(r1, r8)
                            if (r1 == 0) goto L2d
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                            goto L13
                        L2d:
                            r1 = 2131230798(0x7f08004e, float:1.8077659E38)
                            if (r8 != r1) goto L3d
                            r2 = 16842800(0x1010030, float:2.3693693E-38)
                            r8 = 1109603123(0x42233333, float:40.8)
                            int r8 = java.lang.Math.round(r8)
                            goto L14
                        L3d:
                            r1 = 2131230780(0x7f08003c, float:1.8077622E38)
                            if (r8 != r1) goto L43
                            goto L13
                        L43:
                            r8 = -1
                            r1 = 0
                            r2 = 0
                        L46:
                            if (r1 == 0) goto L5f
                            int[] r1 = androidx.appcompat.widget.DrawableUtils.f1295a
                            android.graphics.drawable.Drawable r9 = r9.mutate()
                            int r7 = androidx.appcompat.widget.ThemeUtils.m947c(r7, r2)
                            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.AppCompatDrawableManager.m727c(r7, r0)
                            r9.setColorFilter(r7)
                            if (r8 == r3) goto L5e
                            r9.setAlpha(r8)
                        L5e:
                            return r5
                        L5f:
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.C01071.mo732a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /* renamed from: b */
                    public PorterDuff.Mode mo733b(int i2) {
                        if (i2 == C2507R.drawable.abc_switch_thumb_material) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /* renamed from: c */
                    public Drawable mo734c(@NonNull ResourceManagerInternal resourceManagerInternal2, @NonNull Context context, int i2) {
                        if (i2 == C2507R.drawable.abc_cab_background_top_material) {
                            return new LayerDrawable(new Drawable[]{resourceManagerInternal2.m890f(context, C2507R.drawable.abc_cab_background_internal_bg), resourceManagerInternal2.m890f(context, C2507R.drawable.abc_cab_background_top_mtrl_alpha)});
                        }
                        if (i2 == C2507R.drawable.abc_ratingbar_material) {
                            return m739h(resourceManagerInternal2, context, C2507R.dimen.abc_star_big);
                        }
                        if (i2 == C2507R.drawable.abc_ratingbar_indicator_material) {
                            return m739h(resourceManagerInternal2, context, C2507R.dimen.abc_star_medium);
                        }
                        if (i2 == C2507R.drawable.abc_ratingbar_small_material) {
                            return m739h(resourceManagerInternal2, context, C2507R.dimen.abc_star_small);
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /* renamed from: d */
                    public ColorStateList mo735d(@NonNull Context context, int i2) {
                        if (i2 == C2507R.drawable.abc_edit_text_material) {
                            return AppCompatResources.m496a(context, C2507R.color.abc_tint_edittext);
                        }
                        if (i2 == C2507R.drawable.abc_switch_track_mtrl_alpha) {
                            return AppCompatResources.m496a(context, C2507R.color.abc_tint_switch_track);
                        }
                        if (i2 == C2507R.drawable.abc_switch_thumb_material) {
                            int[][] iArr = new int[3][];
                            int[] iArr2 = new int[3];
                            ColorStateList m948d = ThemeUtils.m948d(context, C2507R.attr.colorSwitchThumbNormal);
                            if (m948d == null || !m948d.isStateful()) {
                                iArr[0] = ThemeUtils.f1568b;
                                iArr2[0] = ThemeUtils.m946b(context, C2507R.attr.colorSwitchThumbNormal);
                                iArr[1] = ThemeUtils.f1571e;
                                iArr2[1] = ThemeUtils.m947c(context, C2507R.attr.colorControlActivated);
                                iArr[2] = ThemeUtils.f1572f;
                                iArr2[2] = ThemeUtils.m947c(context, C2507R.attr.colorSwitchThumbNormal);
                            } else {
                                iArr[0] = ThemeUtils.f1568b;
                                iArr2[0] = m948d.getColorForState(iArr[0], 0);
                                iArr[1] = ThemeUtils.f1571e;
                                iArr2[1] = ThemeUtils.m947c(context, C2507R.attr.colorControlActivated);
                                iArr[2] = ThemeUtils.f1572f;
                                iArr2[2] = m948d.getDefaultColor();
                            }
                            return new ColorStateList(iArr, iArr2);
                        }
                        if (i2 == C2507R.drawable.abc_btn_default_mtrl_shape) {
                            return m738g(context, ThemeUtils.m947c(context, C2507R.attr.colorButtonNormal));
                        }
                        if (i2 == C2507R.drawable.abc_btn_borderless_material) {
                            return m738g(context, 0);
                        }
                        if (i2 == C2507R.drawable.abc_btn_colored_material) {
                            return m738g(context, ThemeUtils.m947c(context, C2507R.attr.colorAccent));
                        }
                        if (i2 == C2507R.drawable.abc_spinner_mtrl_am_alpha || i2 == C2507R.drawable.abc_spinner_textfield_background_material) {
                            return AppCompatResources.m496a(context, C2507R.color.abc_tint_spinner);
                        }
                        if (m737f(this.f1168b, i2)) {
                            return ThemeUtils.m948d(context, C2507R.attr.colorControlNormal);
                        }
                        if (m737f(this.f1171e, i2)) {
                            return AppCompatResources.m496a(context, C2507R.color.abc_tint_default);
                        }
                        if (m737f(this.f1172f, i2)) {
                            return AppCompatResources.m496a(context, C2507R.color.abc_tint_btn_checkable);
                        }
                        if (i2 == C2507R.drawable.abc_seekbar_thumb_material) {
                            return AppCompatResources.m496a(context, C2507R.color.abc_tint_seek_thumb);
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /* renamed from: e */
                    public boolean mo736e(@NonNull Context context, int i2, @NonNull Drawable drawable) {
                        if (i2 == C2507R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                            int m947c = ThemeUtils.m947c(context, C2507R.attr.colorControlNormal);
                            PorterDuff.Mode mode = AppCompatDrawableManager.f1164b;
                            m740i(findDrawableByLayerId, m947c, mode);
                            m740i(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ThemeUtils.m947c(context, C2507R.attr.colorControlNormal), mode);
                            m740i(layerDrawable.findDrawableByLayerId(R.id.progress), ThemeUtils.m947c(context, C2507R.attr.colorControlActivated), mode);
                            return true;
                        }
                        if (i2 != C2507R.drawable.abc_ratingbar_material && i2 != C2507R.drawable.abc_ratingbar_indicator_material && i2 != C2507R.drawable.abc_ratingbar_small_material) {
                            return false;
                        }
                        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                        Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                        int m946b = ThemeUtils.m946b(context, C2507R.attr.colorControlNormal);
                        PorterDuff.Mode mode2 = AppCompatDrawableManager.f1164b;
                        m740i(findDrawableByLayerId2, m946b, mode2);
                        m740i(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), ThemeUtils.m947c(context, C2507R.attr.colorControlActivated), mode2);
                        m740i(layerDrawable2.findDrawableByLayerId(R.id.progress), ThemeUtils.m947c(context, C2507R.attr.colorControlActivated), mode2);
                        return true;
                    }

                    /* renamed from: f */
                    public final boolean m737f(int[] iArr, int i2) {
                        for (int i3 : iArr) {
                            if (i3 == i2) {
                                return true;
                            }
                        }
                        return false;
                    }

                    /* renamed from: g */
                    public final ColorStateList m738g(@NonNull Context context, @ColorInt int i2) {
                        int m947c = ThemeUtils.m947c(context, C2507R.attr.colorControlHighlight);
                        return new ColorStateList(new int[][]{ThemeUtils.f1568b, ThemeUtils.f1570d, ThemeUtils.f1569c, ThemeUtils.f1572f}, new int[]{ThemeUtils.m946b(context, C2507R.attr.colorButtonNormal), ColorUtils.m1773b(m947c, i2), ColorUtils.m1773b(m947c, i2), i2});
                    }

                    /* renamed from: h */
                    public final LayerDrawable m739h(@NonNull ResourceManagerInternal resourceManagerInternal2, @NonNull Context context, @DimenRes int i2) {
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable3;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                        Drawable m890f = resourceManagerInternal2.m890f(context, C2507R.drawable.abc_star_black_48dp);
                        Drawable m890f2 = resourceManagerInternal2.m890f(context, C2507R.drawable.abc_star_half_black_48dp);
                        if ((m890f instanceof BitmapDrawable) && m890f.getIntrinsicWidth() == dimensionPixelSize && m890f.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable) m890f;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            m890f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            m890f.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(createBitmap);
                            bitmapDrawable2 = new BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                        if ((m890f2 instanceof BitmapDrawable) && m890f2.getIntrinsicWidth() == dimensionPixelSize && m890f2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) m890f2;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            m890f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            m890f2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                        layerDrawable.setId(0, R.id.background);
                        layerDrawable.setId(1, R.id.secondaryProgress);
                        layerDrawable.setId(2, R.id.progress);
                        return layerDrawable;
                    }

                    /* renamed from: i */
                    public final void m740i(Drawable drawable, int i2, PorterDuff.Mode mode) {
                        int[] iArr = DrawableUtils.f1295a;
                        Drawable mutate = drawable.mutate();
                        if (mode == null) {
                            mode = AppCompatDrawableManager.f1164b;
                        }
                        mutate.setColorFilter(AppCompatDrawableManager.m727c(i2, mode));
                    }
                };
                synchronized (resourceManagerInternal) {
                    resourceManagerInternal.f1408g = resourceManagerHooks;
                }
            }
        }
    }

    /* renamed from: f */
    public static void m729f(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.f1399h;
        int[] state = drawable.getState();
        int[] iArr2 = DrawableUtils.f1295a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = tintInfo.f1579d;
        if (z || tintInfo.f1578c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? tintInfo.f1576a : null;
            PorterDuff.Mode mode2 = tintInfo.f1578c ? tintInfo.f1577b : ResourceManagerInternal.f1399h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = ResourceManagerInternal.m884h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: b */
    public synchronized Drawable m730b(@NonNull Context context, @DrawableRes int i2) {
        return this.f1166a.m890f(context, i2);
    }

    /* renamed from: d */
    public synchronized ColorStateList m731d(@NonNull Context context, @DrawableRes int i2) {
        return this.f1166a.m892i(context, i2);
    }
}
