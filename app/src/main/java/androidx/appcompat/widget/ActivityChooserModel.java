package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
class ActivityChooserModel extends DataSetObservable {

    /* renamed from: k */
    public static final Object f1082k = new Object();

    /* renamed from: l */
    public static final Map<String, ActivityChooserModel> f1083l = new HashMap();

    /* renamed from: d */
    public final Context f1087d;

    /* renamed from: e */
    public final String f1088e;

    /* renamed from: a */
    public final Object f1084a = new Object();

    /* renamed from: b */
    public final List<ActivityResolveInfo> f1085b = new ArrayList();

    /* renamed from: c */
    public final List<HistoricalRecord> f1086c = new ArrayList();

    /* renamed from: f */
    public ActivitySorter f1089f = new DefaultSorter();

    /* renamed from: g */
    public int f1090g = 50;

    /* renamed from: h */
    public boolean f1091h = true;

    /* renamed from: i */
    public boolean f1092i = false;

    /* renamed from: j */
    public boolean f1093j = true;

    public interface ActivityChooserModelClient {
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {

        /* renamed from: b */
        public final ResolveInfo f1094b;

        /* renamed from: c */
        public float f1095c;

        @Override // java.lang.Comparable
        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.f1095c) - Float.floatToIntBits(this.f1095c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.f1095c) == Float.floatToIntBits(((ActivityResolveInfo) obj).f1095c);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1095c) + 31;
        }

        public String toString() {
            StringBuilder m27x = C0000a.m27x("[", "resolveInfo:");
            m27x.append(this.f1094b.toString());
            m27x.append("; weight:");
            m27x.append(new BigDecimal(this.f1095c));
            m27x.append("]");
            return m27x.toString();
        }
    }

    public interface ActivitySorter {
    }

    public static final class DefaultSorter implements ActivitySorter {

        /* renamed from: a */
        public final Map<ComponentName, ActivityResolveInfo> f1096a = new HashMap();
    }

    public static final class HistoricalRecord {

        /* renamed from: a */
        public final ComponentName f1097a;

        /* renamed from: b */
        public final long f1098b;

        /* renamed from: c */
        public final float f1099c;

        public HistoricalRecord(ComponentName componentName, long j2, float f2) {
            this.f1097a = componentName;
            this.f1098b = j2;
            this.f1099c = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.f1097a;
            if (componentName == null) {
                if (historicalRecord.f1097a != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.f1097a)) {
                return false;
            }
            return this.f1098b == historicalRecord.f1098b && Float.floatToIntBits(this.f1099c) == Float.floatToIntBits(historicalRecord.f1099c);
        }

        public int hashCode() {
            ComponentName componentName = this.f1097a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j2 = this.f1098b;
            return Float.floatToIntBits(this.f1099c) + ((((hashCode + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }

        public String toString() {
            StringBuilder m27x = C0000a.m27x("[", "; activity:");
            m27x.append(this.f1097a);
            m27x.append("; time:");
            m27x.append(this.f1098b);
            m27x.append("; weight:");
            m27x.append(new BigDecimal(this.f1099c));
            m27x.append("]");
            return m27x.toString();
        }
    }

    public interface OnChooseActivityListener {
    }

    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        public PersistHistoryAsyncTask() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
        
            if (r8 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00d8, code lost:
        
            r8.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
        
            if (r8 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
        
            if (r8 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
        
            if (r8 == null) goto L36;
         */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Object[] r18) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.PersistHistoryAsyncTask.doInBackground(java.lang.Object[]):java.lang.Object");
        }
    }

    public ActivityChooserModel(Context context, String str) {
        this.f1087d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1088e = str;
        } else {
            this.f1088e = C0000a.m14k(str, ".xml");
        }
    }

    /* renamed from: d */
    public static ActivityChooserModel m701d(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (f1082k) {
            Map<String, ActivityChooserModel> map = f1083l;
            activityChooserModel = (ActivityChooserModel) ((HashMap) map).get(null);
            if (activityChooserModel == null) {
                activityChooserModel = new ActivityChooserModel(null, null);
                ((HashMap) map).put(null, activityChooserModel);
            }
        }
        return activityChooserModel;
    }

    /* renamed from: a */
    public final boolean m702a(HistoricalRecord historicalRecord) {
        boolean add = this.f1086c.add(historicalRecord);
        if (add) {
            this.f1093j = true;
            m708h();
            if (!this.f1092i) {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (this.f1093j) {
                this.f1093j = false;
                if (!TextUtils.isEmpty(this.f1088e)) {
                    new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1086c), this.f1088e);
                }
            }
            notifyChanged();
        }
        return add;
    }

    /* renamed from: b */
    public Intent m703b(int i2) {
        synchronized (this.f1084a) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cb, code lost:
    
        if (r4 == null) goto L48;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m704c() {
        /*
            r12 = this;
            boolean r0 = r12.f1091h
            r1 = 0
            if (r0 == 0) goto Ld7
            boolean r0 = r12.f1093j
            if (r0 == 0) goto Ld7
            java.lang.String r0 = r12.f1088e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ld7
            r12.f1091h = r1
            r0 = 1
            r12.f1092i = r0
            java.lang.String r2 = "Error reading historical recrod file: "
            java.lang.String r3 = "ActivityChooserModel"
            android.content.Context r4 = r12.f1087d     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r5 = r12.f1088e     // Catch: java.lang.Throwable -> Ld8
            java.io.FileInputStream r4 = r4.openFileInput(r5)     // Catch: java.lang.Throwable -> Ld8
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            java.lang.String r6 = "UTF-8"
            r5.setInput(r4, r6)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            r6 = 0
        L2c:
            if (r6 == r0) goto L36
            r7 = 2
            if (r6 == r7) goto L36
            int r6 = r5.next()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            goto L2c
        L36:
            java.lang.String r6 = "historical-records"
            java.lang.String r7 = r5.getName()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            if (r6 == 0) goto L94
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r6 = r12.f1086c     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            r6.clear()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
        L47:
            int r7 = r5.next()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            if (r7 != r0) goto L51
            if (r4 == 0) goto Ld8
            goto Lcd
        L51:
            r8 = 3
            if (r7 == r8) goto L47
            r8 = 4
            if (r7 != r8) goto L58
            goto L47
        L58:
            java.lang.String r7 = r5.getName()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            java.lang.String r8 = "historical-record"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            if (r7 == 0) goto L8c
            java.lang.String r7 = "activity"
            r8 = 0
            java.lang.String r7 = r5.getAttributeValue(r8, r7)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            java.lang.String r9 = "time"
            java.lang.String r9 = r5.getAttributeValue(r8, r9)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            long r9 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            java.lang.String r11 = "weight"
            java.lang.String r8 = r5.getAttributeValue(r8, r11)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            float r8 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r11 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            android.content.ComponentName r7 = android.content.ComponentName.unflattenFromString(r7)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            r11.<init>(r7, r9, r8)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            r6.add(r11)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            goto L47
        L8c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            java.lang.String r6 = "Share records file not well-formed."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            throw r5     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
        L94:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            java.lang.String r6 = "Share records file does not start with historical-records tag."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
            throw r5     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9e org.xmlpull.v1.XmlPullParserException -> Lb6
        L9c:
            r0 = move-exception
            goto Ld1
        L9e:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r6.<init>()     // Catch: java.lang.Throwable -> L9c
            r6.append(r2)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = r12.f1088e     // Catch: java.lang.Throwable -> L9c
            r6.append(r2)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L9c
            android.util.Log.e(r3, r2, r5)     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto Ld8
            goto Lcd
        Lb6:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r6.<init>()     // Catch: java.lang.Throwable -> L9c
            r6.append(r2)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = r12.f1088e     // Catch: java.lang.Throwable -> L9c
            r6.append(r2)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L9c
            android.util.Log.e(r3, r2, r5)     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto Ld8
        Lcd:
            r4.close()
            goto Ld8
        Ld1:
            if (r4 == 0) goto Ld6
            r4.close()     // Catch: java.io.IOException -> Ld6
        Ld6:
            throw r0
        Ld7:
            r0 = 0
        Ld8:
            r0 = r0 | r1
            r12.m708h()
            if (r0 == 0) goto Le1
            r12.notifyChanged()
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.m704c():void");
    }

    /* renamed from: e */
    public ResolveInfo m705e(int i2) {
        ResolveInfo resolveInfo;
        synchronized (this.f1084a) {
            m704c();
            resolveInfo = this.f1085b.get(i2).f1094b;
        }
        return resolveInfo;
    }

    /* renamed from: f */
    public int m706f() {
        int size;
        synchronized (this.f1084a) {
            m704c();
            size = this.f1085b.size();
        }
        return size;
    }

    /* renamed from: g */
    public ResolveInfo m707g() {
        synchronized (this.f1084a) {
            m704c();
            if (this.f1085b.isEmpty()) {
                return null;
            }
            return this.f1085b.get(0).f1094b;
        }
    }

    /* renamed from: h */
    public final void m708h() {
        int size = this.f1086c.size() - this.f1090g;
        if (size <= 0) {
            return;
        }
        this.f1093j = true;
        for (int i2 = 0; i2 < size; i2++) {
            this.f1086c.remove(0);
        }
    }
}
