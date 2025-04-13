package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.exo.metadata.id3.ApicFrame;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame;

/* loaded from: classes3.dex */
final class ae0 {

    /* renamed from: a */
    @VisibleForTesting
    public static final String[] f48492a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    /* renamed from: a */
    private static CommentFrame m22471a(int i2, ap0 ap0Var) {
        int m22595h = ap0Var.m22595h();
        if (ap0Var.m22595h() == 1684108385) {
            ap0Var.m22593f(8);
            String m22585b = ap0Var.m22585b(m22595h - 16);
            return new CommentFrame("und", m22585b, m22585b);
        }
        StringBuilder m26356a = l60.m26356a("Failed to parse comment attribute: ");
        m26356a.append(AbstractC5331kb.m26095a(i2));
        d90.m23842d("MetadataUtil", m26356a.toString());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:8:0x002b, B:10:0x0034, B:12:0x0045, B:14:0x004b, B:16:0x0052, B:20:0x0059, B:22:0x003e, B:25:0x0067, B:30:0x0076, B:35:0x0086, B:40:0x0095, B:45:0x00a4, B:50:0x00b1, B:55:0x00c0, B:60:0x00cf, B:65:0x00de, B:70:0x00ed, B:75:0x00fc, B:80:0x010b, B:85:0x011a, B:90:0x0129, B:95:0x0138, B:101:0x014b, B:103:0x0151, B:118:0x0165, B:115:0x0171, B:111:0x017c, B:125:0x0189, B:128:0x0232, B:133:0x01a8, B:146:0x01d0, B:151:0x01df, B:156:0x01ee, B:161:0x01fd, B:166:0x020c, B:171:0x021b, B:176:0x0228, B:179:0x024e, B:182:0x0258), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #0 {all -> 0x01b0, blocks: (B:8:0x002b, B:10:0x0034, B:12:0x0045, B:14:0x004b, B:16:0x0052, B:20:0x0059, B:22:0x003e, B:25:0x0067, B:30:0x0076, B:35:0x0086, B:40:0x0095, B:45:0x00a4, B:50:0x00b1, B:55:0x00c0, B:60:0x00cf, B:65:0x00de, B:70:0x00ed, B:75:0x00fc, B:80:0x010b, B:85:0x011a, B:90:0x0129, B:95:0x0138, B:101:0x014b, B:103:0x0151, B:118:0x0165, B:115:0x0171, B:111:0x017c, B:125:0x0189, B:128:0x0232, B:133:0x01a8, B:146:0x01d0, B:151:0x01df, B:156:0x01ee, B:161:0x01fd, B:166:0x020c, B:171:0x021b, B:176:0x0228, B:179:0x024e, B:182:0x0258), top: B:2:0x0018 }] */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.exo.metadata.id3.Id3Frame m22474b(com.yandex.mobile.ads.impl.ap0 r13) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ae0.m22474b(com.yandex.mobile.ads.impl.ap0):com.yandex.mobile.ads.exo.metadata.id3.Id3Frame");
    }

    @Nullable
    /* renamed from: a */
    private static TextInformationFrame m22473a(int i2, ap0 ap0Var, String str) {
        int m22595h = ap0Var.m22595h();
        if (ap0Var.m22595h() == 1684108385 && m22595h >= 22) {
            ap0Var.m22593f(10);
            int m22613z = ap0Var.m22613z();
            if (m22613z > 0) {
                String m26036a = k60.m26036a("", m22613z);
                int m22613z2 = ap0Var.m22613z();
                if (m22613z2 > 0) {
                    m26036a = m26036a + "/" + m22613z2;
                }
                return new TextInformationFrame(str, null, m26036a);
            }
        }
        StringBuilder m26356a = l60.m26356a("Failed to parse index/count attribute: ");
        m26356a.append(AbstractC5331kb.m26095a(i2));
        d90.m23842d("MetadataUtil", m26356a.toString());
        return null;
    }

    @Nullable
    /* renamed from: a */
    private static ApicFrame m22470a(ap0 ap0Var) {
        int m22595h = ap0Var.m22595h();
        if (ap0Var.m22595h() == 1684108385) {
            int m22595h2 = ap0Var.m22595h() & 16777215;
            String str = m22595h2 == 13 ? "image/jpeg" : m22595h2 == 14 ? "image/png" : null;
            if (str == null) {
                c80.m23073a("Unrecognized cover art flags: ", m22595h2, "MetadataUtil");
                return null;
            }
            ap0Var.m22593f(4);
            int i2 = m22595h - 16;
            byte[] bArr = new byte[i2];
            ap0Var.m22583a(bArr, 0, i2);
            return new ApicFrame(str, null, 3, bArr);
        }
        d90.m23842d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    @Nullable
    /* renamed from: a */
    private static Id3Frame m22472a(int i2, String str, ap0 ap0Var, boolean z, boolean z2) {
        int i3;
        ap0Var.m22593f(4);
        if (ap0Var.m22595h() == 1684108385) {
            ap0Var.m22593f(8);
            i3 = ap0Var.m22607t();
        } else {
            d90.m23842d("MetadataUtil", "Failed to parse uint8 attribute value");
            i3 = -1;
        }
        if (z2) {
            i3 = Math.min(1, i3);
        }
        if (i3 >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, Integer.toString(i3));
            }
            return new CommentFrame("und", str, Integer.toString(i3));
        }
        StringBuilder m26356a = l60.m26356a("Failed to parse uint8 attribute: ");
        m26356a.append(AbstractC5331kb.m26095a(i2));
        d90.m23842d("MetadataUtil", m26356a.toString());
        return null;
    }

    @Nullable
    /* renamed from: b */
    private static TextInformationFrame m22475b(int i2, ap0 ap0Var, String str) {
        int m22595h = ap0Var.m22595h();
        if (ap0Var.m22595h() == 1684108385) {
            ap0Var.m22593f(8);
            return new TextInformationFrame(str, null, ap0Var.m22585b(m22595h - 16));
        }
        StringBuilder m26356a = l60.m26356a("Failed to parse text attribute: ");
        m26356a.append(AbstractC5331kb.m26095a(i2));
        d90.m23842d("MetadataUtil", m26356a.toString());
        return null;
    }
}
