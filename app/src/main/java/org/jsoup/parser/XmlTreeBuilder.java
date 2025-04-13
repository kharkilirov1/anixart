package org.jsoup.parser;

import java.io.Reader;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Token;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class XmlTreeBuilder extends TreeBuilder {

    /* renamed from: org.jsoup.parser.XmlTreeBuilder$1 */
    public static /* synthetic */ class C69721 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69278a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f69278a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69278a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69278a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69278a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69278a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69278a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    /* renamed from: c */
    public ParseSettings mo34852c() {
        return ParseSettings.f69119d;
    }

    @Override // org.jsoup.parser.TreeBuilder
    @ParametersAreNonnullByDefault
    /* renamed from: d */
    public void mo34853d(Reader reader, String str, Parser parser) {
        super.mo34853d(reader, str, parser);
        this.f69271e.add(this.f69270d);
        Document.OutputSettings outputSettings = this.f69270d.f68960k;
        outputSettings.f68971i = Document.OutputSettings.Syntax.xml;
        outputSettings.f68964b = Entities.EscapeMode.xhtml;
        outputSettings.f68968f = false;
    }

    @Override // org.jsoup.parser.TreeBuilder
    /* renamed from: f */
    public boolean mo34854f(Token token) {
        Element element;
        XmlDeclaration m34737H;
        int ordinal = token.f69141a.ordinal();
        if (ordinal != 0) {
            Element element2 = null;
            if (ordinal == 1) {
                Token.StartTag startTag = (Token.StartTag) token;
                Tag m34957i = m34957i(startTag.m34915r(), this.f69274h);
                if (startTag.m34914q()) {
                    startTag.f69163n.m34722g(this.f69274h);
                }
                ParseSettings parseSettings = this.f69274h;
                Attributes attributes = startTag.f69163n;
                parseSettings.m34887b(attributes);
                Element element3 = new Element(m34957i, null, attributes);
                m34952a().m34753F(element3);
                if (!startTag.f69162m) {
                    this.f69271e.add(element3);
                } else if (!((HashMap) Tag.f69125k).containsKey(m34957i.f69132b)) {
                    m34957i.f69137g = true;
                }
            } else if (ordinal == 2) {
                String m34888c = this.f69274h.m34888c(((Token.EndTag) token).f69153d);
                int size = this.f69271e.size() - 1;
                int i2 = size >= 256 ? size - 256 : 0;
                int size2 = this.f69271e.size();
                while (true) {
                    size2--;
                    if (size2 < i2) {
                        break;
                    }
                    Element element4 = this.f69271e.get(size2);
                    if (element4.mo34733r().equals(m34888c)) {
                        element2 = element4;
                        break;
                    }
                }
                if (element2 != null) {
                    int size3 = this.f69271e.size();
                    do {
                        size3--;
                        if (size3 < 0) {
                            break;
                        }
                        element = this.f69271e.get(size3);
                        this.f69271e.remove(size3);
                    } while (element != element2);
                }
            } else if (ordinal == 3) {
                Token.Comment comment = (Token.Comment) token;
                Comment comment2 = new Comment(comment.m34903k());
                if (comment.f69147f && comment2.m34738I() && (m34737H = comment2.m34737H()) != null) {
                    comment2 = m34737H;
                }
                m34952a().m34753F(comment2);
            } else if (ordinal == 4) {
                Token.Character character = (Token.Character) token;
                String str = character.f69144d;
                m34952a().m34753F(character instanceof Token.CData ? new CDataNode(str) : new TextNode(str));
            } else if (ordinal != 5) {
                StringBuilder m24u = C0000a.m24u("Unexpected token type: ");
                m24u.append(token.f69141a);
                throw new IllegalArgumentException(m24u.toString());
            }
        } else {
            Token.Doctype doctype = (Token.Doctype) token;
            DocumentType documentType = new DocumentType(this.f69274h.m34888c(doctype.m34904i()), doctype.f69150f.toString(), doctype.f69151g.toString());
            documentType.m34747H(doctype.f69149e);
            m34952a().m34753F(documentType);
        }
        return true;
    }
}
