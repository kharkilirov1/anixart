package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class Chars {

    @GwtCompatible
    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final char[] f21918b;

        /* renamed from: c */
        public final int f21919c;

        /* renamed from: d */
        public final int f21920d;

        public CharArrayAsList(char[] cArr, int i2, int i3) {
            this.f21918b = cArr;
            this.f21919c = i2;
            this.f21920d = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (obj instanceof Character) {
                char[] cArr = this.f21918b;
                char charValue = ((Character) obj).charValue();
                int i2 = this.f21919c;
                int i3 = this.f21920d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (cArr[i2] == charValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f21918b[this.f21919c + i2] != charArrayAsList.f21918b[charArrayAsList.f21919c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Character.valueOf(this.f21918b[this.f21919c + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f21919c; i3 < this.f21920d; i3++) {
                i2 = (i2 * 31) + this.f21918b[i3];
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                char[] cArr = this.f21918b;
                char charValue = ((Character) obj).charValue();
                int i2 = this.f21919c;
                int i3 = this.f21920d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (cArr[i2] == charValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - this.f21919c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                char[] cArr = this.f21918b;
                char charValue = ((Character) obj).charValue();
                int i2 = this.f21919c;
                int i3 = this.f21920d - 1;
                while (true) {
                    if (i3 < i2) {
                        i3 = -1;
                        break;
                    }
                    if (cArr[i3] == charValue) {
                        break;
                    }
                    i3--;
                }
                if (i3 >= 0) {
                    return i3 - this.f21919c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            Character ch = (Character) obj;
            Preconditions.m11186j(i2, size());
            char[] cArr = this.f21918b;
            int i3 = this.f21919c + i2;
            char c2 = cArr[i3];
            Objects.requireNonNull(ch);
            cArr[i3] = ch.charValue();
            return Character.valueOf(c2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21920d - this.f21919c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            char[] cArr = this.f21918b;
            int i4 = this.f21919c;
            return new CharArrayAsList(cArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
            sb.append('[');
            sb.append(this.f21918b[this.f21919c]);
            int i2 = this.f21919c;
            while (true) {
                i2++;
                if (i2 >= this.f21920d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f21918b[i2]);
            }
        }
    }

    public enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            char[] cArr3 = cArr;
            char[] cArr4 = cArr2;
            int min = Math.min(cArr3.length, cArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                int i3 = cArr3[i2] - cArr4[i2];
                if (i3 != 0) {
                    return i3;
                }
            }
            return cArr3.length - cArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }
}
