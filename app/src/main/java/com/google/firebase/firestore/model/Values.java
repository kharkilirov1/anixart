package com.google.firebase.firestore.model;

import androidx.annotation.Nullable;
import com.google.cloud.datastore.core.number.NumberComparisonHelper;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import com.google.firestore.p012v1.ArrayValue;
import com.google.firestore.p012v1.MapValue;
import com.google.firestore.p012v1.Value;
import com.google.protobuf.NullValue;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class Values {

    /* renamed from: a */
    public static final Value f22880a;

    /* renamed from: b */
    public static final Value f22881b;

    /* renamed from: c */
    public static final Value f22882c;

    /* renamed from: d */
    public static final Value f22883d;

    /* renamed from: e */
    public static final Value f22884e;

    /* renamed from: com.google.firebase.firestore.model.Values$1 */
    public static /* synthetic */ class C21061 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22885a;

        static {
            int[] iArr = new int[Value.ValueTypeCase.values().length];
            f22885a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22885a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22885a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22885a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22885a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22885a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22885a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22885a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22885a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22885a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22885a[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        Value.Builder m12804Y = Value.m12804Y();
        m12804Y.m12816r(Double.NaN);
        f22880a = m12804Y.mo13437A();
        Value.Builder m12804Y2 = Value.m12804Y();
        NullValue nullValue = NullValue.NULL_VALUE;
        m12804Y2.m13441n();
        Value.m12801K((Value) m12804Y2.f24185c, nullValue);
        Value mo13437A = m12804Y2.mo13437A();
        f22881b = mo13437A;
        f22882c = mo13437A;
        Value.Builder m12804Y3 = Value.m12804Y();
        m12804Y3.m13441n();
        Value.m12799I((Value) m12804Y3.f24185c, "__max__");
        Value mo13437A2 = m12804Y3.mo13437A();
        f22883d = mo13437A2;
        Value.Builder m12804Y4 = Value.m12804Y();
        MapValue.Builder m12766O = MapValue.m12766O();
        m12766O.m12771r("__type__", mo13437A2);
        m12804Y4.m12817s(m12766O);
        f22884e = m12804Y4.mo13437A();
    }

    /* renamed from: a */
    public static String m12457a(Value value) {
        StringBuilder sb = new StringBuilder();
        m12458b(sb, value);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m12458b(StringBuilder sb, Value value) {
        boolean z = true;
        switch (value.m12815X()) {
            case NULL_VALUE:
                sb.append("null");
                return;
            case BOOLEAN_VALUE:
                sb.append(value.m12806N());
                return;
            case INTEGER_VALUE:
                sb.append(value.m12810S());
                return;
            case DOUBLE_VALUE:
                sb.append(value.m12808Q());
                return;
            case TIMESTAMP_VALUE:
                Timestamp m12814W = value.m12814W();
                sb.append(String.format("time(%s,%s)", Long.valueOf(m12814W.m13643K()), Integer.valueOf(m12814W.m13642J())));
                return;
            case STRING_VALUE:
                sb.append(value.m12813V());
                return;
            case BYTES_VALUE:
                sb.append(Util.m12502f(value.m12807O()));
                return;
            case REFERENCE_VALUE:
                Assert.m12490b(m12463g(value), "Value should be a ReferenceValue", new Object[0]);
                sb.append(DocumentKey.m12441c(value.m12812U()));
                return;
            case GEO_POINT_VALUE:
                LatLng m12809R = value.m12809R();
                sb.append(String.format("geo(%s,%s)", Double.valueOf(m12809R.m13789J()), Double.valueOf(m12809R.m13790K())));
                return;
            case ARRAY_VALUE:
                ArrayValue m12805M = value.m12805M();
                sb.append("[");
                for (int i2 = 0; i2 < m12805M.m12737K(); i2++) {
                    m12458b(sb, m12805M.m12736J(i2));
                    if (i2 != m12805M.m12737K() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                return;
            case MAP_VALUE:
                MapValue m12811T = value.m12811T();
                ArrayList arrayList = new ArrayList(m12811T.m12768L().keySet());
                Collections.sort(arrayList);
                sb.append("{");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (z) {
                        z = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(str);
                    sb.append(":");
                    m12458b(sb, m12811T.m12770N(str));
                }
                sb.append("}");
                return;
            default:
                StringBuilder m24u = C0000a.m24u("Invalid value type: ");
                m24u.append(value.m12815X());
                Assert.m12489a(m24u.toString(), new Object[0]);
                throw null;
        }
    }

    /* renamed from: c */
    public static int m12459c(Value value, Value value2) {
        int m12464h = m12464h(value);
        int m12464h2 = m12464h(value2);
        if (m12464h != m12464h2) {
            return Util.m12499c(m12464h, m12464h2);
        }
        if (m12464h == Integer.MAX_VALUE) {
            return 0;
        }
        switch (m12464h) {
            case 0:
                return 0;
            case 1:
                boolean m12806N = value.m12806N();
                boolean m12806N2 = value2.m12806N();
                int i2 = Util.f23027a;
                if (m12806N == m12806N2) {
                    return 0;
                }
                return m12806N ? 1 : -1;
            case 2:
                Value.ValueTypeCase valueTypeCase = Value.ValueTypeCase.INTEGER_VALUE;
                Value.ValueTypeCase m12815X = value.m12815X();
                Value.ValueTypeCase valueTypeCase2 = Value.ValueTypeCase.DOUBLE_VALUE;
                if (m12815X == valueTypeCase2) {
                    double m12808Q = value.m12808Q();
                    if (value2.m12815X() == valueTypeCase2) {
                        double m12808Q2 = value2.m12808Q();
                        int i3 = Util.f23027a;
                        return NumberComparisonHelper.m11116a(m12808Q, m12808Q2);
                    }
                    if (value2.m12815X() == valueTypeCase) {
                        return Util.m12500d(m12808Q, value2.m12810S());
                    }
                } else if (value.m12815X() == valueTypeCase) {
                    long m12810S = value.m12810S();
                    if (value2.m12815X() == valueTypeCase) {
                        long m12810S2 = value2.m12810S();
                        int i4 = Util.f23027a;
                        if (m12810S < m12810S2) {
                            r2 = -1;
                        } else if (m12810S > m12810S2) {
                            r2 = 1;
                        }
                        return r2;
                    }
                    if (value2.m12815X() == valueTypeCase2) {
                        return Util.m12500d(value2.m12808Q(), m12810S) * (-1);
                    }
                }
                Assert.m12489a("Unexpected values: %s vs %s", value, value2);
                throw null;
            case 3:
                return m12460d(value.m12814W(), value2.m12814W());
            case 4:
                return m12460d(ServerTimestamps.m12454a(value), ServerTimestamps.m12454a(value2));
            case 5:
                return value.m12813V().compareTo(value2.m12813V());
            case 6:
                return Util.m12498b(value.m12807O(), value2.m12807O());
            case 7:
                String m12812U = value.m12812U();
                String m12812U2 = value2.m12812U();
                String[] split = m12812U.split("/", -1);
                String[] split2 = m12812U2.split("/", -1);
                int min = Math.min(split.length, split2.length);
                while (r2 < min) {
                    int compareTo = split[r2].compareTo(split2[r2]);
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    r2++;
                }
                return Util.m12499c(split.length, split2.length);
            case 8:
                LatLng m12809R = value.m12809R();
                LatLng m12809R2 = value2.m12809R();
                double m13789J = m12809R.m13789J();
                double m13789J2 = m12809R2.m13789J();
                int i5 = Util.f23027a;
                int m11116a = NumberComparisonHelper.m11116a(m13789J, m13789J2);
                return m11116a == 0 ? NumberComparisonHelper.m11116a(m12809R.m13790K(), m12809R2.m13790K()) : m11116a;
            case 9:
                ArrayValue m12805M = value.m12805M();
                ArrayValue m12805M2 = value2.m12805M();
                int min2 = Math.min(m12805M.m12737K(), m12805M2.m12737K());
                while (r2 < min2) {
                    int m12459c = m12459c(m12805M.m12736J(r2), m12805M2.m12736J(r2));
                    if (m12459c != 0) {
                        return m12459c;
                    }
                    r2++;
                }
                return Util.m12499c(m12805M.m12737K(), m12805M2.m12737K());
            case 10:
                MapValue m12811T = value.m12811T();
                MapValue m12811T2 = value2.m12811T();
                Iterator it = new TreeMap(m12811T.m12768L()).entrySet().iterator();
                Iterator it2 = new TreeMap(m12811T2.m12768L()).entrySet().iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    int compareTo2 = ((String) entry.getKey()).compareTo((String) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    int m12459c2 = m12459c((Value) entry.getValue(), (Value) entry2.getValue());
                    if (m12459c2 != 0) {
                        return m12459c2;
                    }
                }
                boolean hasNext = it.hasNext();
                boolean hasNext2 = it2.hasNext();
                int i6 = Util.f23027a;
                return hasNext != hasNext2 ? hasNext ? 1 : -1 : 0;
            default:
                Assert.m12489a(C0000a.m7d("Invalid value type: ", m12464h), new Object[0]);
                throw null;
        }
    }

    /* renamed from: d */
    public static int m12460d(Timestamp timestamp, Timestamp timestamp2) {
        long m13643K = timestamp.m13643K();
        long m13643K2 = timestamp2.m13643K();
        int i2 = Util.f23027a;
        int i3 = m13643K < m13643K2 ? -1 : m13643K > m13643K2 ? 1 : 0;
        return i3 != 0 ? i3 : Util.m12499c(timestamp.m13642J(), timestamp2.m13642J());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        if (r5.m12810S() == r6.m12810S()) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cc, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ef, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.m12808Q()) == java.lang.Double.doubleToLongBits(r6.m12808Q())) goto L55;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m12461e(com.google.firestore.p012v1.Value r5, com.google.firestore.p012v1.Value r6) {
        /*
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto Lf2
            if (r6 != 0) goto Lb
            goto Lf2
        Lb:
            int r2 = m12464h(r5)
            int r3 = m12464h(r6)
            if (r2 == r3) goto L16
            return r1
        L16:
            r3 = 2
            if (r2 == r3) goto Lb1
            r3 = 4
            if (r2 == r3) goto La4
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto La3
            r3 = 9
            if (r2 == r3) goto L76
            r3 = 10
            if (r2 == r3) goto L2e
            boolean r5 = r5.equals(r6)
            return r5
        L2e:
            com.google.firestore.v1.MapValue r5 = r5.m12811T()
            com.google.firestore.v1.MapValue r6 = r6.m12811T()
            int r2 = r5.m12767K()
            int r3 = r6.m12767K()
            if (r2 == r3) goto L42
        L40:
            r0 = 0
            goto L75
        L42:
            java.util.Map r5 = r5.m12768L()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r3 = r6.m12768L()
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            com.google.firestore.v1.Value r3 = (com.google.firestore.p012v1.Value) r3
            java.lang.Object r2 = r2.getValue()
            com.google.firestore.v1.Value r2 = (com.google.firestore.p012v1.Value) r2
            boolean r2 = m12461e(r2, r3)
            if (r2 != 0) goto L4e
            goto L40
        L75:
            return r0
        L76:
            com.google.firestore.v1.ArrayValue r5 = r5.m12805M()
            com.google.firestore.v1.ArrayValue r6 = r6.m12805M()
            int r2 = r5.m12737K()
            int r3 = r6.m12737K()
            if (r2 == r3) goto L8a
        L88:
            r0 = 0
            goto La3
        L8a:
            r2 = 0
        L8b:
            int r3 = r5.m12737K()
            if (r2 >= r3) goto La3
            com.google.firestore.v1.Value r3 = r5.m12736J(r2)
            com.google.firestore.v1.Value r4 = r6.m12736J(r2)
            boolean r3 = m12461e(r3, r4)
            if (r3 != 0) goto La0
            goto L88
        La0:
            int r2 = r2 + 1
            goto L8b
        La3:
            return r0
        La4:
            com.google.protobuf.Timestamp r5 = com.google.firebase.firestore.model.ServerTimestamps.m12454a(r5)
            com.google.protobuf.Timestamp r6 = com.google.firebase.firestore.model.ServerTimestamps.m12454a(r6)
            boolean r5 = r5.equals(r6)
            return r5
        Lb1:
            com.google.firestore.v1.Value$ValueTypeCase r2 = r5.m12815X()
            com.google.firestore.v1.Value$ValueTypeCase r3 = com.google.firestore.v1.Value.ValueTypeCase.INTEGER_VALUE
            if (r2 != r3) goto Lcf
            com.google.firestore.v1.Value$ValueTypeCase r2 = r6.m12815X()
            if (r2 != r3) goto Lcf
            long r2 = r5.m12810S()
            long r5 = r6.m12810S()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto Lcc
            goto Lcd
        Lcc:
            r0 = 0
        Lcd:
            r1 = r0
            goto Lf2
        Lcf:
            com.google.firestore.v1.Value$ValueTypeCase r2 = r5.m12815X()
            com.google.firestore.v1.Value$ValueTypeCase r3 = com.google.firestore.v1.Value.ValueTypeCase.DOUBLE_VALUE
            if (r2 != r3) goto Lf2
            com.google.firestore.v1.Value$ValueTypeCase r2 = r6.m12815X()
            if (r2 != r3) goto Lf2
            double r2 = r5.m12808Q()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r5 = r6.m12808Q()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto Lcc
            goto Lcd
        Lf2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.model.Values.m12461e(com.google.firestore.v1.Value, com.google.firestore.v1.Value):boolean");
    }

    /* renamed from: f */
    public static boolean m12462f(Value value) {
        return f22883d.equals(value.m12811T().m12768L().get("__type__"));
    }

    /* renamed from: g */
    public static boolean m12463g(@Nullable Value value) {
        return value != null && value.m12815X() == Value.ValueTypeCase.REFERENCE_VALUE;
    }

    /* renamed from: h */
    public static int m12464h(Value value) {
        switch (value.m12815X()) {
            case NULL_VALUE:
                return 0;
            case BOOLEAN_VALUE:
                return 1;
            case INTEGER_VALUE:
            case DOUBLE_VALUE:
                return 2;
            case TIMESTAMP_VALUE:
                return 3;
            case STRING_VALUE:
                return 5;
            case BYTES_VALUE:
                return 6;
            case REFERENCE_VALUE:
                return 7;
            case GEO_POINT_VALUE:
                return 8;
            case ARRAY_VALUE:
                return 9;
            case MAP_VALUE:
                if (ServerTimestamps.m12455b(value)) {
                    return 4;
                }
                return m12462f(value) ? Integer.MAX_VALUE : 10;
            default:
                StringBuilder m24u = C0000a.m24u("Invalid value type: ");
                m24u.append(value.m12815X());
                Assert.m12489a(m24u.toString(), new Object[0]);
                throw null;
        }
    }
}
