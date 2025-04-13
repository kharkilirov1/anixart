package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ConstraintAttribute {

    /* renamed from: a */
    public boolean f2738a;

    /* renamed from: b */
    public String f2739b;

    /* renamed from: c */
    public AttributeType f2740c;

    /* renamed from: d */
    public int f2741d;

    /* renamed from: e */
    public float f2742e;

    /* renamed from: f */
    public String f2743f;

    /* renamed from: g */
    public boolean f2744g;

    /* renamed from: h */
    public int f2745h;

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1 */
    public static /* synthetic */ class C02161 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2746a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f2746a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2746a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2746a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2746a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2746a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2746a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2746a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2746a[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.f2738a = false;
        this.f2739b = str;
        this.f2740c = attributeType;
        this.f2738a = z;
        m1420c(obj);
    }

    /* renamed from: a */
    public static void m1418a(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object valueOf;
        AttributeType attributeType2 = AttributeType.DIMENSION_TYPE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0218R.styleable.f3029e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType3 = null;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType3 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    if (index == 7) {
                        obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        attributeType = AttributeType.FLOAT_TYPE;
                        valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        attributeType = AttributeType.INT_TYPE;
                        valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 9) {
                        attributeType = AttributeType.STRING_TYPE;
                        valueOf = obtainStyledAttributes.getString(index);
                    } else if (index == 8) {
                        attributeType = AttributeType.REFERENCE_TYPE;
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        valueOf = Integer.valueOf(resourceId);
                    }
                    attributeType3 = attributeType2;
                }
                Object obj2 = valueOf;
                attributeType3 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType3, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static void m1419b(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(str);
            String m14k = !constraintAttribute.f2738a ? C0000a.m14k("set", str) : str;
            try {
                switch (constraintAttribute.f2740c) {
                    case INT_TYPE:
                        cls.getMethod(m14k, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f2741d));
                        break;
                    case FLOAT_TYPE:
                        cls.getMethod(m14k, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f2742e));
                        break;
                    case COLOR_TYPE:
                        cls.getMethod(m14k, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f2745h));
                        break;
                    case COLOR_DRAWABLE_TYPE:
                        Method method = cls.getMethod(m14k, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f2745h);
                        method.invoke(view, colorDrawable);
                        break;
                    case STRING_TYPE:
                        cls.getMethod(m14k, CharSequence.class).invoke(view, constraintAttribute.f2743f);
                        break;
                    case BOOLEAN_TYPE:
                        cls.getMethod(m14k, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f2744g));
                        break;
                    case DIMENSION_TYPE:
                        cls.getMethod(m14k, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f2742e));
                        break;
                    case REFERENCE_TYPE:
                        cls.getMethod(m14k, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f2741d));
                        break;
                }
            } catch (IllegalAccessException e2) {
                StringBuilder m28y = C0000a.m28y(" Custom Attribute \"", str, "\" not found on ");
                m28y.append(cls.getName());
                Log.e("TransitionLayout", m28y.toString());
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Log.e("TransitionLayout", e3.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(m14k);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e4) {
                StringBuilder m28y2 = C0000a.m28y(" Custom Attribute \"", str, "\" not found on ");
                m28y2.append(cls.getName());
                Log.e("TransitionLayout", m28y2.toString());
                e4.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void m1420c(Object obj) {
        switch (this.f2740c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f2741d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f2742e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f2745h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f2743f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f2744g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f2742e = ((Float) obj).floatValue();
                break;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f2738a = false;
        this.f2739b = constraintAttribute.f2739b;
        this.f2740c = constraintAttribute.f2740c;
        m1420c(obj);
    }
}
