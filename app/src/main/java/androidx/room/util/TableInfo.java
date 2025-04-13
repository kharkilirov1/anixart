package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public final class TableInfo {

    /* renamed from: a */
    public final String f5923a;

    /* renamed from: b */
    public final Map<String, Column> f5924b;

    /* renamed from: c */
    public final Set<ForeignKey> f5925c;

    /* renamed from: d */
    @Nullable
    public final Set<Index> f5926d;

    public static final class Column {

        /* renamed from: a */
        public final String f5927a;

        /* renamed from: b */
        public final String f5928b;

        /* renamed from: c */
        @ColumnInfo.SQLiteTypeAffinity
        public final int f5929c;

        /* renamed from: d */
        public final boolean f5930d;

        /* renamed from: e */
        public final int f5931e;

        /* renamed from: f */
        public final String f5932f;

        /* renamed from: g */
        public final int f5933g;

        public Column(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.f5927a = str;
            this.f5928b = str2;
            this.f5930d = z;
            this.f5931e = i2;
            int i4 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i4 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i4 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i4 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f5929c = i4;
            this.f5932f = str3;
            this.f5933g = i3;
        }

        /* renamed from: a */
        public static boolean m4099a(@NonNull String str, @Nullable String str2) {
            boolean z;
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (str.length() != 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 < str.length()) {
                        char charAt = str.charAt(i2);
                        if (i2 == 0 && charAt != '(') {
                            break;
                        }
                        if (charAt != '(') {
                            if (charAt == ')' && i3 - 1 == 0 && i2 != str.length() - 1) {
                                break;
                            }
                        } else {
                            i3++;
                        }
                        i2++;
                    } else if (i3 == 0) {
                        z = true;
                    }
                }
            }
            z = false;
            if (z) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Column)) {
                return false;
            }
            Column column = (Column) obj;
            if (this.f5931e != column.f5931e || !this.f5927a.equals(column.f5927a) || this.f5930d != column.f5930d) {
                return false;
            }
            if (this.f5933g == 1 && column.f5933g == 2 && (str3 = this.f5932f) != null && !m4099a(str3, column.f5932f)) {
                return false;
            }
            if (this.f5933g == 2 && column.f5933g == 1 && (str2 = column.f5932f) != null && !m4099a(str2, this.f5932f)) {
                return false;
            }
            int i2 = this.f5933g;
            return (i2 == 0 || i2 != column.f5933g || ((str = this.f5932f) == null ? column.f5932f == null : m4099a(str, column.f5932f))) && this.f5929c == column.f5929c;
        }

        public int hashCode() {
            return (((((this.f5927a.hashCode() * 31) + this.f5929c) * 31) + (this.f5930d ? 1231 : 1237)) * 31) + this.f5931e;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Column{name='");
            C0576a.m4100A(m24u, this.f5927a, '\'', ", type='");
            C0576a.m4100A(m24u, this.f5928b, '\'', ", affinity='");
            m24u.append(this.f5929c);
            m24u.append('\'');
            m24u.append(", notNull=");
            m24u.append(this.f5930d);
            m24u.append(", primaryKeyPosition=");
            m24u.append(this.f5931e);
            m24u.append(", defaultValue='");
            m24u.append(this.f5932f);
            m24u.append('\'');
            m24u.append('}');
            return m24u.toString();
        }
    }

    @RestrictTo
    public static final class ForeignKey {

        /* renamed from: a */
        @NonNull
        public final String f5934a;

        /* renamed from: b */
        @NonNull
        public final String f5935b;

        /* renamed from: c */
        @NonNull
        public final String f5936c;

        /* renamed from: d */
        @NonNull
        public final List<String> f5937d;

        /* renamed from: e */
        @NonNull
        public final List<String> f5938e;

        public ForeignKey(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<String> list, @NonNull List<String> list2) {
            this.f5934a = str;
            this.f5935b = str2;
            this.f5936c = str3;
            this.f5937d = Collections.unmodifiableList(list);
            this.f5938e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (this.f5934a.equals(foreignKey.f5934a) && this.f5935b.equals(foreignKey.f5935b) && this.f5936c.equals(foreignKey.f5936c) && this.f5937d.equals(foreignKey.f5937d)) {
                return this.f5938e.equals(foreignKey.f5938e);
            }
            return false;
        }

        public int hashCode() {
            return this.f5938e.hashCode() + ((this.f5937d.hashCode() + C0576a.m4107f(this.f5936c, C0576a.m4107f(this.f5935b, this.f5934a.hashCode() * 31, 31), 31)) * 31);
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("ForeignKey{referenceTable='");
            C0576a.m4100A(m24u, this.f5934a, '\'', ", onDelete='");
            C0576a.m4100A(m24u, this.f5935b, '\'', ", onUpdate='");
            C0576a.m4100A(m24u, this.f5936c, '\'', ", columnNames=");
            m24u.append(this.f5937d);
            m24u.append(", referenceColumnNames=");
            return C0576a.m4119r(m24u, this.f5938e, '}');
        }
    }

    @RestrictTo
    public static class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {

        /* renamed from: b */
        public final int f5939b;

        /* renamed from: c */
        public final int f5940c;

        /* renamed from: d */
        public final String f5941d;

        /* renamed from: e */
        public final String f5942e;

        public ForeignKeyWithSequence(int i2, int i3, String str, String str2) {
            this.f5939b = i2;
            this.f5940c = i3;
            this.f5941d = str;
            this.f5942e = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull ForeignKeyWithSequence foreignKeyWithSequence) {
            ForeignKeyWithSequence foreignKeyWithSequence2 = foreignKeyWithSequence;
            int i2 = this.f5939b - foreignKeyWithSequence2.f5939b;
            return i2 == 0 ? this.f5940c - foreignKeyWithSequence2.f5940c : i2;
        }
    }

    @RestrictTo
    public static final class Index {

        /* renamed from: a */
        public final String f5943a;

        /* renamed from: b */
        public final boolean f5944b;

        /* renamed from: c */
        public final List<String> f5945c;

        /* renamed from: d */
        public final List<String> f5946d;

        public Index(String str, boolean z, List<String> list, List<String> list2) {
            this.f5943a = str;
            this.f5944b = z;
            this.f5945c = list;
            this.f5946d = list2.size() == 0 ? Collections.nCopies(list.size(), "ASC") : list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Index)) {
                return false;
            }
            Index index = (Index) obj;
            if (this.f5944b == index.f5944b && this.f5945c.equals(index.f5945c) && this.f5946d.equals(index.f5946d)) {
                return this.f5943a.startsWith("index_") ? index.f5943a.startsWith("index_") : this.f5943a.equals(index.f5943a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5946d.hashCode() + ((this.f5945c.hashCode() + ((((this.f5943a.startsWith("index_") ? -1184239155 : this.f5943a.hashCode()) * 31) + (this.f5944b ? 1 : 0)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Index{name='");
            C0576a.m4100A(m24u, this.f5943a, '\'', ", unique=");
            m24u.append(this.f5944b);
            m24u.append(", columns=");
            m24u.append(this.f5945c);
            m24u.append(", orders=");
            return C0576a.m4119r(m24u, this.f5946d, '}');
        }
    }

    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set, Set<Index> set2) {
        this.f5923a = str;
        this.f5924b = Collections.unmodifiableMap(map);
        this.f5925c = Collections.unmodifiableSet(set);
        this.f5926d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static TableInfo m4096a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        int i2;
        int i3;
        List<ForeignKeyWithSequence> list;
        int i4;
        Cursor mo4040q0 = supportSQLiteDatabase.mo4040q0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (mo4040q0.getColumnCount() > 0) {
                int columnIndex = mo4040q0.getColumnIndex("name");
                int columnIndex2 = mo4040q0.getColumnIndex("type");
                int columnIndex3 = mo4040q0.getColumnIndex("notnull");
                int columnIndex4 = mo4040q0.getColumnIndex("pk");
                int columnIndex5 = mo4040q0.getColumnIndex("dflt_value");
                while (mo4040q0.moveToNext()) {
                    String string = mo4040q0.getString(columnIndex);
                    hashMap.put(string, new Column(string, mo4040q0.getString(columnIndex2), mo4040q0.getInt(columnIndex3) != 0, mo4040q0.getInt(columnIndex4), mo4040q0.getString(columnIndex5), 2));
                }
            }
            mo4040q0.close();
            HashSet hashSet = new HashSet();
            mo4040q0 = supportSQLiteDatabase.mo4040q0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = mo4040q0.getColumnIndex("id");
                int columnIndex7 = mo4040q0.getColumnIndex("seq");
                int columnIndex8 = mo4040q0.getColumnIndex("table");
                int columnIndex9 = mo4040q0.getColumnIndex("on_delete");
                int columnIndex10 = mo4040q0.getColumnIndex("on_update");
                List<ForeignKeyWithSequence> m4097b = m4097b(mo4040q0);
                int count = mo4040q0.getCount();
                int i5 = 0;
                while (i5 < count) {
                    mo4040q0.moveToPosition(i5);
                    if (mo4040q0.getInt(columnIndex7) != 0) {
                        i2 = columnIndex6;
                        i3 = columnIndex7;
                        list = m4097b;
                        i4 = count;
                    } else {
                        int i6 = mo4040q0.getInt(columnIndex6);
                        i2 = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i3 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) m4097b).iterator();
                        while (it.hasNext()) {
                            List<ForeignKeyWithSequence> list2 = m4097b;
                            ForeignKeyWithSequence foreignKeyWithSequence = (ForeignKeyWithSequence) it.next();
                            int i7 = count;
                            if (foreignKeyWithSequence.f5939b == i6) {
                                arrayList.add(foreignKeyWithSequence.f5941d);
                                arrayList2.add(foreignKeyWithSequence.f5942e);
                            }
                            count = i7;
                            m4097b = list2;
                        }
                        list = m4097b;
                        i4 = count;
                        hashSet.add(new ForeignKey(mo4040q0.getString(columnIndex8), mo4040q0.getString(columnIndex9), mo4040q0.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i5++;
                    columnIndex6 = i2;
                    columnIndex7 = i3;
                    count = i4;
                    m4097b = list;
                }
                mo4040q0.close();
                mo4040q0 = supportSQLiteDatabase.mo4040q0("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = mo4040q0.getColumnIndex("name");
                    int columnIndex12 = mo4040q0.getColumnIndex("origin");
                    int columnIndex13 = mo4040q0.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (mo4040q0.moveToNext()) {
                            if ("c".equals(mo4040q0.getString(columnIndex12))) {
                                Index m4098c = m4098c(supportSQLiteDatabase, mo4040q0.getString(columnIndex11), mo4040q0.getInt(columnIndex13) == 1);
                                if (m4098c != null) {
                                    hashSet3.add(m4098c);
                                }
                            }
                        }
                        mo4040q0.close();
                        hashSet2 = hashSet3;
                        return new TableInfo(str, hashMap, hashSet, hashSet2);
                    }
                    return new TableInfo(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: b */
    public static List<ForeignKeyWithSequence> m4097b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new ForeignKeyWithSequence(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @Nullable
    /* renamed from: c */
    public static Index m4098c(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        Cursor mo4040q0 = supportSQLiteDatabase.mo4040q0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo4040q0.getColumnIndex("seqno");
            int columnIndex2 = mo4040q0.getColumnIndex("cid");
            int columnIndex3 = mo4040q0.getColumnIndex("name");
            int columnIndex4 = mo4040q0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (mo4040q0.moveToNext()) {
                    if (mo4040q0.getInt(columnIndex2) >= 0) {
                        int i2 = mo4040q0.getInt(columnIndex);
                        String string = mo4040q0.getString(columnIndex3);
                        String str2 = mo4040q0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i2), string);
                        treeMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new Index(str, z, arrayList, arrayList2);
            }
            return null;
        } finally {
            mo4040q0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        String str = this.f5923a;
        if (str == null ? tableInfo.f5923a != null : !str.equals(tableInfo.f5923a)) {
            return false;
        }
        Map<String, Column> map = this.f5924b;
        if (map == null ? tableInfo.f5924b != null : !map.equals(tableInfo.f5924b)) {
            return false;
        }
        Set<ForeignKey> set2 = this.f5925c;
        if (set2 == null ? tableInfo.f5925c != null : !set2.equals(tableInfo.f5925c)) {
            return false;
        }
        Set<Index> set3 = this.f5926d;
        if (set3 == null || (set = tableInfo.f5926d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f5923a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Column> map = this.f5924b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<ForeignKey> set = this.f5925c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("TableInfo{name='");
        C0576a.m4100A(m24u, this.f5923a, '\'', ", columns=");
        m24u.append(this.f5924b);
        m24u.append(", foreignKeys=");
        m24u.append(this.f5925c);
        m24u.append(", indices=");
        m24u.append(this.f5926d);
        m24u.append('}');
        return m24u.toString();
    }
}
