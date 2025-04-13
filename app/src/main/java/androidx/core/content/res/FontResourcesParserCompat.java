package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.C0222R;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo
/* loaded from: classes.dex */
public class FontResourcesParserCompat {

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1730a(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {

        /* renamed from: a */
        @NonNull
        public final FontFileResourceEntry[] f3326a;

        public FontFamilyFilesResourceEntry(@NonNull FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.f3326a = fontFileResourceEntryArr;
        }
    }

    public static final class FontFileResourceEntry {

        /* renamed from: a */
        @NonNull
        public final String f3327a;

        /* renamed from: b */
        public final int f3328b;

        /* renamed from: c */
        public final boolean f3329c;

        /* renamed from: d */
        public final String f3330d;

        /* renamed from: e */
        public final int f3331e;

        /* renamed from: f */
        public final int f3332f;

        public FontFileResourceEntry(@NonNull String str, int i2, boolean z, @Nullable String str2, int i3, int i4) {
            this.f3327a = str;
            this.f3328b = i2;
            this.f3329c = z;
            this.f3330d = str2;
            this.f3331e = i3;
            this.f3332f = i4;
        }
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {

        /* renamed from: a */
        @NonNull
        public final FontRequest f3333a;

        /* renamed from: b */
        public final int f3334b;

        /* renamed from: c */
        public final int f3335c;

        /* renamed from: d */
        @Nullable
        public final String f3336d;

        @RestrictTo
        public ProviderResourceEntry(@NonNull FontRequest fontRequest, int i2, int i3, @Nullable String str) {
            this.f3333a = fontRequest;
            this.f3335c = i2;
            this.f3334b = i3;
            this.f3336d = str;
        }
    }

    @Nullable
    /* renamed from: a */
    public static FamilyResourceEntry m1726a(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0222R.styleable.f3096b);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(4);
            String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlPullParser.next() != 3) {
                    m1728c(xmlPullParser);
                }
                return new ProviderResourceEntry(new FontRequest(string, string2, string3, m1727b(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0222R.styleable.f3097c);
                        int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = obtainAttributes2.getInt(i3, 0);
                        int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                        String string6 = obtainAttributes2.getString(i5);
                        obtainAttributes2.recycle();
                        while (xmlPullParser.next() != 3) {
                            m1728c(xmlPullParser);
                        }
                        arrayList.add(new FontFileResourceEntry(string6, i2, z, string5, i4, resourceId2));
                    } else {
                        m1728c(xmlPullParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[0]));
            }
        } else {
            m1728c(xmlPullParser);
        }
        return null;
    }

    @NonNull
    /* renamed from: b */
    public static List<List<byte[]>> m1727b(@NonNull Resources resources, @ArrayRes int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Api21Impl.m1730a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1729d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1729d(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    public static void m1728c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* renamed from: d */
    public static List<byte[]> m1729d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
