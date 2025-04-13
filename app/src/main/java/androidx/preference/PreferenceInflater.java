package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
class PreferenceInflater {

    /* renamed from: e */
    public static final Class<?>[] f5073e = {Context.class, AttributeSet.class};

    /* renamed from: f */
    public static final HashMap<String, Constructor<?>> f5074f = new HashMap<>();

    /* renamed from: a */
    @NonNull
    public final Context f5075a;

    /* renamed from: c */
    public PreferenceManager f5077c;

    /* renamed from: b */
    public final Object[] f5076b = new Object[2];

    /* renamed from: d */
    public String[] f5078d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public PreferenceInflater(@NonNull Context context, PreferenceManager preferenceManager) {
        this.f5075a = context;
        this.f5077c = preferenceManager;
    }

    /* renamed from: a */
    public final Preference m3446a(@NonNull String str, @Nullable String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        Class<?> cls;
        Constructor<?> constructor = f5074f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f5075a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 != null) {
                                throw e2;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                        constructor = cls.getConstructor(f5073e);
                        constructor.setAccessible(true);
                        f5074f.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(f5073e);
                    constructor.setAccessible(true);
                    f5074f.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        Object[] objArr = this.f5076b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* renamed from: b */
    public final Preference m3447b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? m3446a(str, this.f5078d, attributeSet) : m3446a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    @NonNull
    /* renamed from: c */
    public Preference m3448c(XmlPullParser xmlPullParser, @Nullable PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f5076b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f5076b[0] = this.f5075a;
            do {
                try {
                    try {
                        try {
                            next = xmlPullParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (XmlPullParserException e2) {
                            InflateException inflateException = new InflateException(e2.getMessage());
                            inflateException.initCause(e2);
                            throw inflateException;
                        }
                    } catch (InflateException e3) {
                        throw e3;
                    }
                } catch (IOException e4) {
                    InflateException inflateException2 = new InflateException(xmlPullParser.getPositionDescription() + ": " + e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) m3447b(xmlPullParser.getName(), asAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.m3390s(this.f5077c);
                preferenceGroup = preferenceGroup2;
            }
            m3449d(xmlPullParser, preferenceGroup, asAttributeSet);
        }
        return preferenceGroup;
    }

    /* renamed from: d */
    public final void m3449d(@NonNull XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f4976n = Intent.parseIntent(this.f5075a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    this.f5075a.getResources().parseBundleExtra("extra", attributeSet, preference.m3379d());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference m3447b = m3447b(name, attributeSet);
                    ((PreferenceGroup) preference).m3424R(m3447b);
                    m3449d(xmlPullParser, m3447b, attributeSet);
                }
            }
        }
    }
}
