package com.swiftsoft.anixartd.utils.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class CropWindowMoveHandler {

    /* renamed from: a */
    public final float f30470a;

    /* renamed from: b */
    public final float f30471b;

    /* renamed from: c */
    public final float f30472c;

    /* renamed from: d */
    public final float f30473d;

    /* renamed from: e */
    public final Type f30474e;

    /* renamed from: f */
    public final PointF f30475f;

    /* renamed from: com.swiftsoft.anixartd.utils.cropper.CropWindowMoveHandler$1 */
    public static /* synthetic */ class C27781 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30476a;

        static {
            int[] iArr = new int[Type.values().length];
            f30476a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30476a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30476a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30476a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30476a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30476a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30476a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30476a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30476a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum Type {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    static {
        new Matrix();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002d. Please report as an issue. */
    public CropWindowMoveHandler(Type type, CropWindowHandler cropWindowHandler, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        PointF pointF = new PointF();
        this.f30475f = pointF;
        this.f30474e = type;
        this.f30470a = cropWindowHandler.m16446d();
        this.f30471b = cropWindowHandler.m16445c();
        this.f30472c = cropWindowHandler.m16444b();
        this.f30473d = cropWindowHandler.m16443a();
        RectF m16447e = cropWindowHandler.m16447e();
        float f8 = 0.0f;
        switch (type) {
            case TOP_LEFT:
                f8 = m16447e.left - f2;
                f4 = m16447e.top;
                f7 = f4 - f3;
                break;
            case TOP_RIGHT:
                f8 = m16447e.right - f2;
                f4 = m16447e.top;
                f7 = f4 - f3;
                break;
            case BOTTOM_LEFT:
                f8 = m16447e.left - f2;
                f4 = m16447e.bottom;
                f7 = f4 - f3;
                break;
            case BOTTOM_RIGHT:
                f8 = m16447e.right - f2;
                f4 = m16447e.bottom;
                f7 = f4 - f3;
                break;
            case LEFT:
                f5 = m16447e.left;
                f6 = f5 - f2;
                f8 = f6;
                f7 = 0.0f;
                break;
            case TOP:
                f4 = m16447e.top;
                f7 = f4 - f3;
                break;
            case RIGHT:
                f5 = m16447e.right;
                f6 = f5 - f2;
                f8 = f6;
                f7 = 0.0f;
                break;
            case BOTTOM:
                f4 = m16447e.bottom;
                f7 = f4 - f3;
                break;
            case CENTER:
                f8 = m16447e.centerX() - f2;
                f4 = m16447e.centerY();
                f7 = f4 - f3;
                break;
            default:
                f6 = 0.0f;
                f8 = f6;
                f7 = 0.0f;
                break;
        }
        pointF.x = f8;
        pointF.y = f7;
    }

    /* renamed from: g */
    public static float m16449g(float f2, float f3, float f4, float f5) {
        return (f4 - f2) / (f5 - f3);
    }

    /* renamed from: a */
    public final void m16450a(RectF rectF, float f2, RectF rectF2, int i2, float f3, float f4, boolean z, boolean z2) {
        float f5 = i2;
        if (f2 > f5) {
            f2 = C0000a.m3D(f2, f5, 1.05f, f5);
            this.f30475f.y -= (f2 - f5) / 1.1f;
        }
        float f6 = rectF2.bottom;
        if (f2 > f6) {
            this.f30475f.y -= (f2 - f6) / 2.0f;
        }
        if (f6 - f2 < f3) {
            f2 = f6;
        }
        float f7 = rectF.top;
        float f8 = f2 - f7;
        float f9 = this.f30471b;
        if (f8 < f9) {
            f2 = f7 + f9;
        }
        float f10 = f2 - f7;
        float f11 = this.f30473d;
        if (f10 > f11) {
            f2 = f7 + f11;
        }
        if (f6 - f2 < f3) {
            f2 = f6;
        }
        if (f4 > 0.0f) {
            float f12 = (f2 - f7) * f4;
            float f13 = this.f30470a;
            if (f12 < f13) {
                f2 = Math.min(f6, (f13 / f4) + f7);
                f12 = (f2 - rectF.top) * f4;
            }
            float f14 = this.f30472c;
            if (f12 > f14) {
                f2 = Math.min(rectF2.bottom, (f14 / f4) + rectF.top);
                f12 = (f2 - rectF.top) * f4;
            }
            if (z && z2) {
                f2 = Math.min(f2, Math.min(rectF2.bottom, (rectF2.width() / f4) + rectF.top));
            } else {
                if (z) {
                    float f15 = rectF.right;
                    float f16 = f15 - f12;
                    float f17 = rectF2.left;
                    if (f16 < f17) {
                        f2 = Math.min(rectF2.bottom, ((f15 - f17) / f4) + rectF.top);
                        f12 = (f2 - rectF.top) * f4;
                    }
                }
                if (z2) {
                    float f18 = rectF.left;
                    float f19 = f12 + f18;
                    float f20 = rectF2.right;
                    if (f19 > f20) {
                        f2 = Math.min(f2, Math.min(rectF2.bottom, ((f20 - f18) / f4) + rectF.top));
                    }
                }
            }
        }
        rectF.bottom = f2;
    }

    /* renamed from: b */
    public final void m16451b(RectF rectF, float f2, RectF rectF2, float f3, float f4, boolean z, boolean z2) {
        if (f2 < 0.0f) {
            f2 /= 1.05f;
            this.f30475f.x -= f2 / 1.1f;
        }
        float f5 = rectF2.left;
        if (f2 < f5) {
            this.f30475f.x -= (f2 - f5) / 2.0f;
        }
        if (f2 - f5 < f3) {
            f2 = f5;
        }
        float f6 = rectF.right;
        float f7 = f6 - f2;
        float f8 = this.f30470a;
        if (f7 < f8) {
            f2 = f6 - f8;
        }
        float f9 = f6 - f2;
        float f10 = this.f30472c;
        if (f9 > f10) {
            f2 = f6 - f10;
        }
        if (f2 - f5 < f3) {
            f2 = f5;
        }
        if (f4 > 0.0f) {
            float f11 = (f6 - f2) / f4;
            float f12 = this.f30471b;
            if (f11 < f12) {
                f2 = Math.max(f5, f6 - (f12 * f4));
                f11 = (rectF.right - f2) / f4;
            }
            float f13 = this.f30473d;
            if (f11 > f13) {
                f2 = Math.max(rectF2.left, rectF.right - (f13 * f4));
                f11 = (rectF.right - f2) / f4;
            }
            if (z && z2) {
                f2 = Math.max(f2, Math.max(rectF2.left, rectF.right - (rectF2.height() * f4)));
            } else {
                if (z) {
                    float f14 = rectF.bottom;
                    float f15 = f14 - f11;
                    float f16 = rectF2.top;
                    if (f15 < f16) {
                        f2 = Math.max(rectF2.left, rectF.right - ((f14 - f16) * f4));
                        f11 = (rectF.right - f2) / f4;
                    }
                }
                if (z2) {
                    float f17 = rectF.top;
                    float f18 = f11 + f17;
                    float f19 = rectF2.bottom;
                    if (f18 > f19) {
                        f2 = Math.max(f2, Math.max(rectF2.left, rectF.right - ((f19 - f17) * f4)));
                    }
                }
            }
        }
        rectF.left = f2;
    }

    /* renamed from: c */
    public final void m16452c(RectF rectF, RectF rectF2, float f2) {
        rectF.inset((rectF.width() - (rectF.height() * f2)) / 2.0f, 0.0f);
        float f3 = rectF.left;
        float f4 = rectF2.left;
        if (f3 < f4) {
            rectF.offset(f4 - f3, 0.0f);
        }
        float f5 = rectF.right;
        float f6 = rectF2.right;
        if (f5 > f6) {
            rectF.offset(f6 - f5, 0.0f);
        }
    }

    /* renamed from: d */
    public final void m16453d(RectF rectF, float f2, RectF rectF2, int i2, float f3, float f4, boolean z, boolean z2) {
        float f5 = i2;
        if (f2 > f5) {
            f2 = C0000a.m3D(f2, f5, 1.05f, f5);
            this.f30475f.x -= (f2 - f5) / 1.1f;
        }
        float f6 = rectF2.right;
        if (f2 > f6) {
            this.f30475f.x -= (f2 - f6) / 2.0f;
        }
        if (f6 - f2 < f3) {
            f2 = f6;
        }
        float f7 = rectF.left;
        float f8 = f2 - f7;
        float f9 = this.f30470a;
        if (f8 < f9) {
            f2 = f7 + f9;
        }
        float f10 = f2 - f7;
        float f11 = this.f30472c;
        if (f10 > f11) {
            f2 = f7 + f11;
        }
        if (f6 - f2 < f3) {
            f2 = f6;
        }
        if (f4 > 0.0f) {
            float f12 = (f2 - f7) / f4;
            float f13 = this.f30471b;
            if (f12 < f13) {
                f2 = Math.min(f6, (f13 * f4) + f7);
                f12 = (f2 - rectF.left) / f4;
            }
            float f14 = this.f30473d;
            if (f12 > f14) {
                f2 = Math.min(rectF2.right, (f14 * f4) + rectF.left);
                f12 = (f2 - rectF.left) / f4;
            }
            if (z && z2) {
                f2 = Math.min(f2, Math.min(rectF2.right, (rectF2.height() * f4) + rectF.left));
            } else {
                if (z) {
                    float f15 = rectF.bottom;
                    float f16 = f15 - f12;
                    float f17 = rectF2.top;
                    if (f16 < f17) {
                        f2 = Math.min(rectF2.right, ((f15 - f17) * f4) + rectF.left);
                        f12 = (f2 - rectF.left) / f4;
                    }
                }
                if (z2) {
                    float f18 = rectF.top;
                    float f19 = f12 + f18;
                    float f20 = rectF2.bottom;
                    if (f19 > f20) {
                        f2 = Math.min(f2, Math.min(rectF2.right, ((f20 - f18) * f4) + rectF.left));
                    }
                }
            }
        }
        rectF.right = f2;
    }

    /* renamed from: e */
    public final void m16454e(RectF rectF, float f2, RectF rectF2, float f3, float f4, boolean z, boolean z2) {
        if (f2 < 0.0f) {
            f2 /= 1.05f;
            this.f30475f.y -= f2 / 1.1f;
        }
        float f5 = rectF2.top;
        if (f2 < f5) {
            this.f30475f.y -= (f2 - f5) / 2.0f;
        }
        if (f2 - f5 < f3) {
            f2 = f5;
        }
        float f6 = rectF.bottom;
        float f7 = f6 - f2;
        float f8 = this.f30471b;
        if (f7 < f8) {
            f2 = f6 - f8;
        }
        float f9 = f6 - f2;
        float f10 = this.f30473d;
        if (f9 > f10) {
            f2 = f6 - f10;
        }
        if (f2 - f5 < f3) {
            f2 = f5;
        }
        if (f4 > 0.0f) {
            float f11 = (f6 - f2) * f4;
            float f12 = this.f30470a;
            if (f11 < f12) {
                f2 = Math.max(f5, f6 - (f12 / f4));
                f11 = (rectF.bottom - f2) * f4;
            }
            float f13 = this.f30472c;
            if (f11 > f13) {
                f2 = Math.max(rectF2.top, rectF.bottom - (f13 / f4));
                f11 = (rectF.bottom - f2) * f4;
            }
            if (z && z2) {
                f2 = Math.max(f2, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f4)));
            } else {
                if (z) {
                    float f14 = rectF.right;
                    float f15 = f14 - f11;
                    float f16 = rectF2.left;
                    if (f15 < f16) {
                        f2 = Math.max(rectF2.top, rectF.bottom - ((f14 - f16) / f4));
                        f11 = (rectF.bottom - f2) * f4;
                    }
                }
                if (z2) {
                    float f17 = rectF.left;
                    float f18 = f11 + f17;
                    float f19 = rectF2.right;
                    if (f18 > f19) {
                        f2 = Math.max(f2, Math.max(rectF2.top, rectF.bottom - ((f19 - f17) / f4)));
                    }
                }
            }
        }
        rectF.top = f2;
    }

    /* renamed from: f */
    public final void m16455f(RectF rectF, RectF rectF2, float f2) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f2)) / 2.0f);
        float f3 = rectF.top;
        float f4 = rectF2.top;
        if (f3 < f4) {
            rectF.offset(0.0f, f4 - f3);
        }
        float f5 = rectF.bottom;
        float f6 = rectF2.bottom;
        if (f5 > f6) {
            rectF.offset(0.0f, f6 - f5);
        }
    }
}
