package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import com.skydoves.balloon.C2451R;
import com.skydoves.balloon.DefinitionKt;
import com.skydoves.balloon.extensions.DrawableExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VectorTextView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R.\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, m31884d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/skydoves/balloon/vectortext/VectorTextViewParams;", "value", "h", "Lcom/skydoves/balloon/vectortext/VectorTextViewParams;", "getDrawableTextViewParams", "()Lcom/skydoves/balloon/vectortext/VectorTextViewParams;", "setDrawableTextViewParams", "(Lcom/skydoves/balloon/vectortext/VectorTextViewParams;)V", "drawableTextViewParams", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "balloon_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VectorTextView extends AppCompatTextView {

    /* renamed from: h, reason: from kotlin metadata */
    @Nullable
    public VectorTextViewParams drawableTextViewParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VectorTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m32179h(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2451R.styleable.f24727a);
            Intrinsics.m32178g(obtainStyledAttributes, "context.obtainStyledAttr…styleable.VectorTextView)");
            setDrawableTextViewParams(new VectorTextViewParams(DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(2, Integer.MIN_VALUE)), DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(4, Integer.MIN_VALUE)), DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(0, Integer.MIN_VALUE)), DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(7, Integer.MIN_VALUE)), null, null, null, null, null, null, DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(3, Integer.MIN_VALUE)), DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(6, Integer.MIN_VALUE)), DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE)), DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(1, Integer.MIN_VALUE)), DefinitionKt.m13872a(obtainStyledAttributes.getResourceId(5, Integer.MIN_VALUE)), 1008));
            obtainStyledAttributes.recycle();
        }
    }

    @Nullable
    public final VectorTextViewParams getDrawableTextViewParams() {
        return this.drawableTextViewParams;
    }

    public final void setDrawableTextViewParams(@Nullable VectorTextViewParams vectorTextViewParams) {
        Drawable drawable = null;
        if (vectorTextViewParams != null) {
            Integer num = vectorTextViewParams.f24764j;
            if (num == null) {
                Integer num2 = vectorTextViewParams.f24768n;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    Context context = getContext();
                    Intrinsics.m32178g(context, "context");
                    num = Integer.valueOf(context.getResources().getDimensionPixelSize(intValue));
                } else {
                    num = null;
                }
            }
            if (num == null) {
                Integer num3 = vectorTextViewParams.f24769o;
                if (num3 != null) {
                    int intValue2 = num3.intValue();
                    Context context2 = getContext();
                    Intrinsics.m32178g(context2, "context");
                    num = Integer.valueOf(context2.getResources().getDimensionPixelSize(intValue2));
                } else {
                    num = null;
                }
            }
            Integer num4 = vectorTextViewParams.f24764j;
            if (num4 == null) {
                Integer num5 = vectorTextViewParams.f24767m;
                if (num5 != null) {
                    int intValue3 = num5.intValue();
                    Context context3 = getContext();
                    Intrinsics.m32178g(context3, "context");
                    num4 = Integer.valueOf(context3.getResources().getDimensionPixelSize(intValue3));
                } else {
                    num4 = null;
                }
            }
            if (num4 == null) {
                Integer num6 = vectorTextViewParams.f24769o;
                if (num6 != null) {
                    int intValue4 = num6.intValue();
                    Context context4 = getContext();
                    Intrinsics.m32178g(context4, "context");
                    num4 = Integer.valueOf(context4.getResources().getDimensionPixelSize(intValue4));
                } else {
                    num4 = null;
                }
            }
            Drawable drawable2 = vectorTextViewParams.f24759e;
            if (drawable2 == null) {
                Integer num7 = vectorTextViewParams.f24755a;
                if (num7 != null) {
                    Drawable m497b = AppCompatResources.m497b(getContext(), num7.intValue());
                    if (m497b != null) {
                        Context context5 = getContext();
                        Intrinsics.m32178g(context5, "context");
                        Drawable m13877b = DrawableExtensionKt.m13877b(m497b, context5, vectorTextViewParams.f24766l);
                        Context context6 = getContext();
                        Intrinsics.m32178g(context6, "context");
                        drawable2 = DrawableExtensionKt.m13876a(m13877b, context6, num4, num);
                    }
                }
                drawable2 = null;
            }
            Drawable drawable3 = vectorTextViewParams.f24760f;
            if (drawable3 == null) {
                Integer num8 = vectorTextViewParams.f24756b;
                if (num8 != null) {
                    Drawable m497b2 = AppCompatResources.m497b(getContext(), num8.intValue());
                    if (m497b2 != null) {
                        Context context7 = getContext();
                        Intrinsics.m32178g(context7, "context");
                        Drawable m13877b2 = DrawableExtensionKt.m13877b(m497b2, context7, vectorTextViewParams.f24766l);
                        Context context8 = getContext();
                        Intrinsics.m32178g(context8, "context");
                        drawable3 = DrawableExtensionKt.m13876a(m13877b2, context8, num4, num);
                    }
                }
                drawable3 = null;
            }
            Drawable drawable4 = vectorTextViewParams.f24761g;
            if (drawable4 == null) {
                Integer num9 = vectorTextViewParams.f24757c;
                if (num9 != null) {
                    Drawable m497b3 = AppCompatResources.m497b(getContext(), num9.intValue());
                    if (m497b3 != null) {
                        Context context9 = getContext();
                        Intrinsics.m32178g(context9, "context");
                        Drawable m13877b3 = DrawableExtensionKt.m13877b(m497b3, context9, vectorTextViewParams.f24766l);
                        Context context10 = getContext();
                        Intrinsics.m32178g(context10, "context");
                        drawable4 = DrawableExtensionKt.m13876a(m13877b3, context10, num4, num);
                    }
                }
                drawable4 = null;
            }
            Drawable drawable5 = vectorTextViewParams.f24762h;
            if (drawable5 != null) {
                drawable = drawable5;
            } else {
                Integer num10 = vectorTextViewParams.f24758d;
                if (num10 != null) {
                    Drawable m497b4 = AppCompatResources.m497b(getContext(), num10.intValue());
                    if (m497b4 != null) {
                        Context context11 = getContext();
                        Intrinsics.m32178g(context11, "context");
                        Drawable m13877b4 = DrawableExtensionKt.m13877b(m497b4, context11, vectorTextViewParams.f24766l);
                        Context context12 = getContext();
                        Intrinsics.m32178g(context12, "context");
                        drawable = DrawableExtensionKt.m13876a(m13877b4, context12, num4, num);
                    }
                }
            }
            setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable, drawable3, drawable4);
            Integer num11 = vectorTextViewParams.f24763i;
            if (num11 != null) {
                setCompoundDrawablePadding(num11.intValue());
            } else {
                Integer num12 = vectorTextViewParams.f24765k;
                if (num12 != null) {
                    int intValue5 = num12.intValue();
                    Context context13 = getContext();
                    Intrinsics.m32178g(context13, "context");
                    setCompoundDrawablePadding(context13.getResources().getDimensionPixelSize(intValue5));
                }
            }
        } else {
            vectorTextViewParams = null;
        }
        this.drawableTextViewParams = vectorTextViewParams;
    }
}
