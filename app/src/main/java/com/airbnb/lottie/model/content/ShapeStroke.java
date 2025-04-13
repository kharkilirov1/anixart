package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.StrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeStroke implements ContentModel {

    /* renamed from: a */
    public final String f7605a;

    /* renamed from: b */
    @Nullable
    public final AnimatableFloatValue f7606b;

    /* renamed from: c */
    public final List<AnimatableFloatValue> f7607c;

    /* renamed from: d */
    public final AnimatableColorValue f7608d;

    /* renamed from: e */
    public final AnimatableIntegerValue f7609e;

    /* renamed from: f */
    public final AnimatableFloatValue f7610f;

    /* renamed from: g */
    public final LineCapType f7611g;

    /* renamed from: h */
    public final LineJoinType f7612h;

    /* renamed from: i */
    public final float f7613i;

    /* renamed from: j */
    public final boolean f7614j;

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1 */
    public static /* synthetic */ class C07631 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7615a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7616b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f7616b = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7616b[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7616b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f7615a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7615a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7615a[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum LineCapType {
        /* JADX INFO: Fake field, exist only in values array */
        BUTT,
        /* JADX INFO: Fake field, exist only in values array */
        ROUND,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN;

        /* renamed from: a */
        public Paint.Cap m4742a() {
            int ordinal = ordinal();
            return ordinal != 0 ? ordinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        /* JADX INFO: Fake field, exist only in values array */
        MITER,
        /* JADX INFO: Fake field, exist only in values array */
        ROUND,
        /* JADX INFO: Fake field, exist only in values array */
        BEVEL;

        /* renamed from: a */
        public Paint.Join m4743a() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return Paint.Join.MITER;
            }
            if (ordinal == 1) {
                return Paint.Join.ROUND;
            }
            if (ordinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public ShapeStroke(String str, @Nullable AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, LineCapType lineCapType, LineJoinType lineJoinType, float f2, boolean z) {
        this.f7605a = str;
        this.f7606b = animatableFloatValue;
        this.f7607c = list;
        this.f7608d = animatableColorValue;
        this.f7609e = animatableIntegerValue;
        this.f7610f = animatableFloatValue2;
        this.f7611g = lineCapType;
        this.f7612h = lineJoinType;
        this.f7613i = f2;
        this.f7614j = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new StrokeContent(lottieDrawable, baseLayer, this);
    }
}
