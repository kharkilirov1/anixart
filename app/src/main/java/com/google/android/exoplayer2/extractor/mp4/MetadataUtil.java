package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
final class MetadataUtil {

    /* renamed from: a */
    @VisibleForTesting
    public static final String[] f11240a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    /* renamed from: a */
    public static CommentFrame m6515a(int i2, ParsableByteArray parsableByteArray) {
        int m7642f = parsableByteArray.m7642f();
        if (parsableByteArray.m7642f() == 1684108385) {
            parsableByteArray.m7636G(8);
            String m7652p = parsableByteArray.m7652p(m7642f - 16);
            return new CommentFrame("und", m7652p, m7652p);
        }
        String valueOf = String.valueOf(Atom.m6492a(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static ApicFrame m6516b(ParsableByteArray parsableByteArray) {
        int m7642f = parsableByteArray.m7642f();
        if (parsableByteArray.m7642f() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int m7642f2 = parsableByteArray.m7642f() & 16777215;
        String str = m7642f2 == 13 ? "image/jpeg" : m7642f2 == 14 ? "image/png" : null;
        if (str == null) {
            C0576a.m4123v(41, "Unrecognized cover art flags: ", m7642f2, "MetadataUtil");
            return null;
        }
        parsableByteArray.m7636G(4);
        int i2 = m7642f - 16;
        byte[] bArr = new byte[i2];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr, 0, i2);
        parsableByteArray.f14699b += i2;
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    /* renamed from: c */
    public static TextInformationFrame m6517c(int i2, String str, ParsableByteArray parsableByteArray) {
        int m7642f = parsableByteArray.m7642f();
        if (parsableByteArray.m7642f() == 1684108385 && m7642f >= 22) {
            parsableByteArray.m7636G(10);
            int m7662z = parsableByteArray.m7662z();
            if (m7662z > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(m7662z);
                String sb2 = sb.toString();
                int m7662z2 = parsableByteArray.m7662z();
                if (m7662z2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(m7662z2);
                    sb2 = sb3.toString();
                }
                return new TextInformationFrame(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(Atom.m6492a(i2));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static TextInformationFrame m6518d(int i2, String str, ParsableByteArray parsableByteArray) {
        int m7642f = parsableByteArray.m7642f();
        if (parsableByteArray.m7642f() == 1684108385) {
            parsableByteArray.m7636G(8);
            return new TextInformationFrame(str, null, parsableByteArray.m7652p(m7642f - 16));
        }
        String valueOf = String.valueOf(Atom.m6492a(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static Id3Frame m6519e(int i2, String str, ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int m6520f = m6520f(parsableByteArray);
        if (z2) {
            m6520f = Math.min(1, m6520f);
        }
        if (m6520f >= 0) {
            return z ? new TextInformationFrame(str, null, Integer.toString(m6520f)) : new CommentFrame("und", str, Integer.toString(m6520f));
        }
        String valueOf = String.valueOf(Atom.m6492a(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    /* renamed from: f */
    public static int m6520f(ParsableByteArray parsableByteArray) {
        parsableByteArray.m7636G(4);
        if (parsableByteArray.m7642f() == 1684108385) {
            parsableByteArray.m7636G(8);
            return parsableByteArray.m7657u();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
