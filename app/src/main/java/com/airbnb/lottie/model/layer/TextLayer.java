package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class TextLayer extends BaseLayer {

    /* renamed from: A */
    public final Paint f7700A;

    /* renamed from: B */
    public final Map<FontCharacter, List<ContentGroup>> f7701B;

    /* renamed from: C */
    public final LongSparseArray<String> f7702C;

    /* renamed from: D */
    public final TextKeyframeAnimation f7703D;

    /* renamed from: E */
    public final LottieDrawable f7704E;

    /* renamed from: F */
    public final LottieComposition f7705F;

    /* renamed from: G */
    @Nullable
    public BaseKeyframeAnimation<Integer, Integer> f7706G;

    /* renamed from: H */
    @Nullable
    public BaseKeyframeAnimation<Integer, Integer> f7707H;

    /* renamed from: I */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f7708I;

    /* renamed from: J */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f7709J;

    /* renamed from: K */
    @Nullable
    public BaseKeyframeAnimation<Float, Float> f7710K;

    /* renamed from: w */
    public final StringBuilder f7711w;

    /* renamed from: x */
    public final RectF f7712x;

    /* renamed from: y */
    public final Matrix f7713y;

    /* renamed from: z */
    public final Paint f7714z;

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$3 */
    public static /* synthetic */ class C07693 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7715a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f7715a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7715a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7715a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableColorValue animatableColorValue;
        AnimatableColorValue animatableColorValue2;
        this.f7711w = new StringBuilder(2);
        this.f7712x = new RectF();
        this.f7713y = new Matrix();
        int i2 = 1;
        this.f7714z = new Paint(this, i2) { // from class: com.airbnb.lottie.model.layer.TextLayer.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.f7700A = new Paint(this, i2) { // from class: com.airbnb.lottie.model.layer.TextLayer.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f7701B = new HashMap();
        this.f7702C = new LongSparseArray<>(10);
        this.f7704E = lottieDrawable;
        this.f7705F = layer.f7665b;
        TextKeyframeAnimation m4740a = layer.f7680q.m4740a();
        this.f7703D = m4740a;
        m4740a.f7410a.add(this);
        m4744e(m4740a);
        AnimatableTextProperties animatableTextProperties = layer.f7681r;
        if (animatableTextProperties != null && (animatableColorValue2 = animatableTextProperties.f7503a) != null) {
            BaseKeyframeAnimation<Integer, Integer> mo4737j = animatableColorValue2.mo4737j();
            this.f7706G = mo4737j;
            mo4737j.f7410a.add(this);
            m4744e(this.f7706G);
        }
        if (animatableTextProperties != null && (animatableColorValue = animatableTextProperties.f7504b) != null) {
            BaseKeyframeAnimation<Integer, Integer> mo4737j2 = animatableColorValue.mo4737j();
            this.f7707H = mo4737j2;
            mo4737j2.f7410a.add(this);
            m4744e(this.f7707H);
        }
        if (animatableTextProperties != null && (animatableFloatValue2 = animatableTextProperties.f7505c) != null) {
            BaseKeyframeAnimation<Float, Float> mo4737j3 = animatableFloatValue2.mo4737j();
            this.f7708I = mo4737j3;
            mo4737j3.f7410a.add(this);
            m4744e(this.f7708I);
        }
        if (animatableTextProperties == null || (animatableFloatValue = animatableTextProperties.f7506d) == null) {
            return;
        }
        BaseKeyframeAnimation<Float, Float> mo4737j4 = animatableFloatValue.mo4737j();
        this.f7709J = mo4737j4;
        mo4737j4.f7410a.add(this);
        m4744e(this.f7709J);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        super.mo4691d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f7705F.f7148j.width(), this.f7705F.f7148j.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.f7648u.m4724c(t, lottieValueCallback);
        if (t == LottieProperty.f7233a) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f7706G;
            if (baseKeyframeAnimation != null) {
                LottieValueCallback<Integer> lottieValueCallback2 = baseKeyframeAnimation.f7414e;
                baseKeyframeAnimation.f7414e = lottieValueCallback;
                return;
            } else if (lottieValueCallback == 0) {
                if (baseKeyframeAnimation != null) {
                    this.f7647t.remove(baseKeyframeAnimation);
                }
                this.f7706G = null;
                return;
            } else {
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
                this.f7706G = valueCallbackKeyframeAnimation;
                valueCallbackKeyframeAnimation.f7410a.add(this);
                m4744e(this.f7706G);
                return;
            }
        }
        if (t == LottieProperty.f7234b) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f7707H;
            if (baseKeyframeAnimation2 != null) {
                LottieValueCallback<Integer> lottieValueCallback3 = baseKeyframeAnimation2.f7414e;
                baseKeyframeAnimation2.f7414e = lottieValueCallback;
                return;
            } else if (lottieValueCallback == 0) {
                if (baseKeyframeAnimation2 != null) {
                    this.f7647t.remove(baseKeyframeAnimation2);
                }
                this.f7707H = null;
                return;
            } else {
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
                this.f7707H = valueCallbackKeyframeAnimation2;
                valueCallbackKeyframeAnimation2.f7410a.add(this);
                m4744e(this.f7707H);
                return;
            }
        }
        if (t == LottieProperty.f7247o) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.f7708I;
            if (baseKeyframeAnimation3 != null) {
                LottieValueCallback<Float> lottieValueCallback4 = baseKeyframeAnimation3.f7414e;
                baseKeyframeAnimation3.f7414e = lottieValueCallback;
                return;
            } else if (lottieValueCallback == 0) {
                if (baseKeyframeAnimation3 != null) {
                    this.f7647t.remove(baseKeyframeAnimation3);
                }
                this.f7708I = null;
                return;
            } else {
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
                this.f7708I = valueCallbackKeyframeAnimation3;
                valueCallbackKeyframeAnimation3.f7410a.add(this);
                m4744e(this.f7708I);
                return;
            }
        }
        if (t != LottieProperty.f7248p) {
            if (t == LottieProperty.f7230B) {
                if (lottieValueCallback == 0) {
                    BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.f7710K;
                    if (baseKeyframeAnimation4 != null) {
                        this.f7647t.remove(baseKeyframeAnimation4);
                    }
                    this.f7710K = null;
                    return;
                }
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
                this.f7710K = valueCallbackKeyframeAnimation4;
                valueCallbackKeyframeAnimation4.f7410a.add(this);
                m4744e(this.f7710K);
                return;
            }
            return;
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.f7709J;
        if (baseKeyframeAnimation5 != null) {
            LottieValueCallback<Float> lottieValueCallback5 = baseKeyframeAnimation5.f7414e;
            baseKeyframeAnimation5.f7414e = lottieValueCallback;
        } else if (lottieValueCallback == 0) {
            if (baseKeyframeAnimation5 != null) {
                this.f7647t.remove(baseKeyframeAnimation5);
            }
            this.f7709J = null;
        } else {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f7709J = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.f7410a.add(this);
            m4744e(this.f7709J);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* renamed from: j */
    public void mo4747j(Canvas canvas, Matrix matrix, int i2) {
        FontAssetManager fontAssetManager;
        String str;
        List<String> list;
        int i3;
        String str2;
        List<ContentGroup> list2;
        String str3;
        float f2;
        int i4;
        canvas.save();
        if (!this.f7704E.m4681w()) {
            canvas.setMatrix(matrix);
        }
        DocumentData mo4707e = this.f7703D.mo4707e();
        Font font = this.f7705F.f7143e.get(mo4707e.f7471b);
        if (font == null) {
            canvas.restore();
            return;
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f7706G;
        if (baseKeyframeAnimation != null) {
            this.f7714z.setColor(baseKeyframeAnimation.mo4707e().intValue());
        } else {
            this.f7714z.setColor(mo4707e.f7477h);
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f7707H;
        if (baseKeyframeAnimation2 != null) {
            this.f7700A.setColor(baseKeyframeAnimation2.mo4707e().intValue());
        } else {
            this.f7700A.setColor(mo4707e.f7478i);
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation3 = this.f7648u.f7450j;
        int intValue = ((baseKeyframeAnimation3 == null ? 100 : baseKeyframeAnimation3.mo4707e().intValue()) * KotlinVersion.MAX_COMPONENT_VALUE) / 100;
        this.f7714z.setAlpha(intValue);
        this.f7700A.setAlpha(intValue);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.f7708I;
        if (baseKeyframeAnimation4 != null) {
            this.f7700A.setStrokeWidth(baseKeyframeAnimation4.mo4707e().floatValue());
        } else {
            this.f7700A.setStrokeWidth(Utils.m4853c() * mo4707e.f7479j * Utils.m4854d(matrix));
        }
        if (this.f7704E.m4681w()) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.f7710K;
            float floatValue = (baseKeyframeAnimation5 == null ? mo4707e.f7472c : baseKeyframeAnimation5.mo4707e().floatValue()) / 100.0f;
            float m4854d = Utils.m4854d(matrix);
            String str4 = mo4707e.f7470a;
            float m4853c = Utils.m4853c() * mo4707e.f7475f;
            List<String> m4759u = m4759u(str4);
            int size = m4759u.size();
            int i5 = 0;
            while (i5 < size) {
                String str5 = m4759u.get(i5);
                float f3 = 0.0f;
                int i6 = 0;
                while (i6 < str5.length()) {
                    FontCharacter m1129c = this.f7705F.f7145g.m1129c(FontCharacter.m4729a(str5.charAt(i6), font.f7483a, font.f7485c));
                    if (m1129c == null) {
                        f2 = m4853c;
                        i4 = i5;
                        str3 = str5;
                    } else {
                        str3 = str5;
                        double d = m1129c.f7488c;
                        f2 = m4853c;
                        i4 = i5;
                        f3 = (float) ((d * floatValue * Utils.m4853c() * m4854d) + f3);
                    }
                    i6++;
                    str5 = str3;
                    m4853c = f2;
                    i5 = i4;
                }
                float f4 = m4853c;
                int i7 = i5;
                String str6 = str5;
                canvas.save();
                m4756q(mo4707e.f7473d, canvas, f3);
                canvas.translate(0.0f, (i7 * f4) - (((size - 1) * f4) / 2.0f));
                int i8 = 0;
                while (i8 < str6.length()) {
                    String str7 = str6;
                    FontCharacter m1129c2 = this.f7705F.f7145g.m1129c(FontCharacter.m4729a(str7.charAt(i8), font.f7483a, font.f7485c));
                    if (m1129c2 == null) {
                        list = m4759u;
                        i3 = size;
                        str2 = str7;
                    } else {
                        if (this.f7701B.containsKey(m1129c2)) {
                            list2 = this.f7701B.get(m1129c2);
                            list = m4759u;
                            i3 = size;
                            str2 = str7;
                        } else {
                            List<ShapeGroup> list3 = m1129c2.f7486a;
                            int size2 = list3.size();
                            ArrayList arrayList = new ArrayList(size2);
                            list = m4759u;
                            int i9 = 0;
                            while (i9 < size2) {
                                arrayList.add(new ContentGroup(this.f7704E, this, list3.get(i9)));
                                i9++;
                                str7 = str7;
                                size = size;
                                list3 = list3;
                            }
                            i3 = size;
                            str2 = str7;
                            this.f7701B.put(m1129c2, arrayList);
                            list2 = arrayList;
                        }
                        int i10 = 0;
                        while (i10 < list2.size()) {
                            Path mo4696t = list2.get(i10).mo4696t();
                            mo4696t.computeBounds(this.f7712x, false);
                            this.f7713y.set(matrix);
                            List<ContentGroup> list4 = list2;
                            this.f7713y.preTranslate(0.0f, (-mo4707e.f7476g) * Utils.m4853c());
                            this.f7713y.preScale(floatValue, floatValue);
                            mo4696t.transform(this.f7713y);
                            if (mo4707e.f7480k) {
                                m4758s(mo4696t, this.f7714z, canvas);
                                m4758s(mo4696t, this.f7700A, canvas);
                            } else {
                                m4758s(mo4696t, this.f7700A, canvas);
                                m4758s(mo4696t, this.f7714z, canvas);
                            }
                            i10++;
                            list2 = list4;
                        }
                        float m4853c2 = Utils.m4853c() * ((float) m1129c2.f7488c) * floatValue * m4854d;
                        float f5 = mo4707e.f7474e / 10.0f;
                        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.f7709J;
                        if (baseKeyframeAnimation6 != null) {
                            f5 += baseKeyframeAnimation6.mo4707e().floatValue();
                        }
                        canvas.translate((f5 * m4854d) + m4853c2, 0.0f);
                    }
                    i8++;
                    m4759u = list;
                    str6 = str2;
                    size = i3;
                }
                canvas.restore();
                i5 = i7 + 1;
                m4853c = f4;
            }
        } else {
            float m4854d2 = Utils.m4854d(matrix);
            LottieDrawable lottieDrawable = this.f7704E;
            ?? r6 = font.f7483a;
            ?? r3 = font.f7485c;
            Typeface typeface = null;
            if (lottieDrawable.getCallback() == null) {
                fontAssetManager = null;
            } else {
                if (lottieDrawable.f7179m == null) {
                    lottieDrawable.f7179m = new FontAssetManager(lottieDrawable.getCallback(), lottieDrawable.f7180n);
                }
                fontAssetManager = lottieDrawable.f7179m;
            }
            if (fontAssetManager != null) {
                MutablePair<String> mutablePair = fontAssetManager.f7456a;
                mutablePair.f7498a = r6;
                mutablePair.f7499b = r3;
                typeface = fontAssetManager.f7457b.get(mutablePair);
                if (typeface == null) {
                    Typeface typeface2 = fontAssetManager.f7458c.get(r6);
                    if (typeface2 == null) {
                        StringBuilder m27x = C0000a.m27x("fonts/", r6);
                        m27x.append(fontAssetManager.f7461f);
                        typeface2 = Typeface.createFromAsset(fontAssetManager.f7459d, m27x.toString());
                        fontAssetManager.f7458c.put(r6, typeface2);
                    }
                    boolean contains = r3.contains("Italic");
                    boolean contains2 = r3.contains("Bold");
                    int i11 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
                    typeface = typeface2.getStyle() == i11 ? typeface2 : Typeface.create(typeface2, i11);
                    fontAssetManager.f7457b.put(fontAssetManager.f7456a, typeface);
                }
            }
            if (typeface != null) {
                String str8 = mo4707e.f7470a;
                TextDelegate textDelegate = this.f7704E.f7181o;
                if (textDelegate != null) {
                    if (textDelegate.f7276b && textDelegate.f7275a.containsKey(str8)) {
                        str8 = textDelegate.f7275a.get(str8);
                    } else if (textDelegate.f7276b) {
                        textDelegate.f7275a.put(str8, str8);
                    }
                }
                this.f7714z.setTypeface(typeface);
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.f7710K;
                this.f7714z.setTextSize(Utils.m4853c() * (baseKeyframeAnimation7 == null ? mo4707e.f7472c : baseKeyframeAnimation7.mo4707e().floatValue()));
                this.f7700A.setTypeface(this.f7714z.getTypeface());
                this.f7700A.setTextSize(this.f7714z.getTextSize());
                float m4853c3 = Utils.m4853c() * mo4707e.f7475f;
                List<String> m4759u2 = m4759u(str8);
                int size3 = m4759u2.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    String str9 = m4759u2.get(i12);
                    m4756q(mo4707e.f7473d, canvas, this.f7700A.measureText(str9));
                    canvas.translate(0.0f, (i12 * m4853c3) - (((size3 - 1) * m4853c3) / 2.0f));
                    int i13 = 0;
                    while (i13 < str9.length()) {
                        int codePointAt = str9.codePointAt(i13);
                        int charCount = Character.charCount(codePointAt) + i13;
                        while (charCount < str9.length()) {
                            int codePointAt2 = str9.codePointAt(charCount);
                            if (!(Character.getType(codePointAt2) == 16 || Character.getType(codePointAt2) == 27 || Character.getType(codePointAt2) == 6 || Character.getType(codePointAt2) == 28 || Character.getType(codePointAt2) == 19)) {
                                break;
                            }
                            charCount += Character.charCount(codePointAt2);
                            codePointAt = (codePointAt * 31) + codePointAt2;
                        }
                        int i14 = size3;
                        float f6 = m4853c3;
                        long j2 = codePointAt;
                        if (this.f7702C.m1092f(j2)) {
                            str = this.f7702C.m1094h(j2);
                        } else {
                            this.f7711w.setLength(0);
                            int i15 = i13;
                            while (i15 < charCount) {
                                int codePointAt3 = str9.codePointAt(i15);
                                this.f7711w.appendCodePoint(codePointAt3);
                                i15 += Character.charCount(codePointAt3);
                            }
                            String sb = this.f7711w.toString();
                            this.f7702C.m1098m(j2, sb);
                            str = sb;
                        }
                        i13 += str.length();
                        if (mo4707e.f7480k) {
                            m4757r(str, this.f7714z, canvas);
                            m4757r(str, this.f7700A, canvas);
                        } else {
                            m4757r(str, this.f7700A, canvas);
                            m4757r(str, this.f7714z, canvas);
                        }
                        float measureText = this.f7714z.measureText(str, 0, 1);
                        float f7 = mo4707e.f7474e / 10.0f;
                        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation8 = this.f7709J;
                        if (baseKeyframeAnimation8 != null) {
                            f7 += baseKeyframeAnimation8.mo4707e().floatValue();
                        }
                        canvas.translate((f7 * m4854d2) + measureText, 0.0f);
                        m4853c3 = f6;
                        size3 = i14;
                    }
                    canvas.setMatrix(matrix);
                }
            }
        }
        canvas.restore();
    }

    /* renamed from: q */
    public final void m4756q(DocumentData.Justification justification, Canvas canvas, float f2) {
        int ordinal = justification.ordinal();
        if (ordinal == 1) {
            canvas.translate(-f2, 0.0f);
        } else {
            if (ordinal != 2) {
                return;
            }
            canvas.translate((-f2) / 2.0f, 0.0f);
        }
    }

    /* renamed from: r */
    public final void m4757r(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* renamed from: s */
    public final void m4758s(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: u */
    public final List<String> m4759u(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }
}
