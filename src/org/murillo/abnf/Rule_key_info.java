/* -----------------------------------------------------------------------------
 * Rule_key_info.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Thu Feb 13 17:50:21 EET 2020
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.ArrayList;

final public class Rule_key_info extends Rule
{
  public Rule_key_info(String spelling, ArrayList<Rule> rules)
  {
    super(spelling, rules);
  }

  public Object accept(Visitor visitor)
  {
    return visitor.visit(this);
  }

  public static Rule_key_info parse(ParserContext context)
  {
    context.push("key-info");

    boolean parsed = true;
    int s0 = context.index;
    ParserAlternative a0 = new ParserAlternative(s0);

    ArrayList<ParserAlternative> as1 = new ArrayList<ParserAlternative>();
    parsed = false;
    {
      int s1 = context.index;
      ParserAlternative a1 = new ParserAlternative(s1);
      parsed = true;
      if (parsed)
      {
        boolean f1 = true;
        int c1 = 0;
        for (int i1 = 0; i1 < 1 && f1; i1++)
        {
          int g1 = context.index;
          ArrayList<ParserAlternative> as2 = new ArrayList<ParserAlternative>();
          parsed = false;
          {
            int s2 = context.index;
            ParserAlternative a2 = new ParserAlternative(s2);
            parsed = true;
            if (parsed)
            {
              boolean f2 = true;
              int c2 = 0;
              for (int i2 = 0; i2 < 1 && f2; i2++)
              {
                Rule rule = Terminal_NumericValue.parse(context, "%x21-3A", "[\\x21-\\x3A]", 1);
                if ((f2 = rule != null))
                {
                  a2.add(rule, context.index);
                  c2++;
                }
              }
              parsed = c2 == 1;
            }
            if (parsed)
            {
              as2.add(a2);
            }
            context.index = s2;
          }
          {
            int s2 = context.index;
            ParserAlternative a2 = new ParserAlternative(s2);
            parsed = true;
            if (parsed)
            {
              boolean f2 = true;
              int c2 = 0;
              for (int i2 = 0; i2 < 1 && f2; i2++)
              {
                Rule rule = Terminal_NumericValue.parse(context, "%x3C-7E", "[\\x3C-\\x7E]", 1);
                if ((f2 = rule != null))
                {
                  a2.add(rule, context.index);
                  c2++;
                }
              }
              parsed = c2 == 1;
            }
            if (parsed)
            {
              as2.add(a2);
            }
            context.index = s2;
          }

          ParserAlternative b = ParserAlternative.getBest(as2);

          parsed = b != null;

          if (parsed)
          {
            a1.add(b.rules, b.end);
            context.index = b.end;
          }

          f1 = context.index > g1;
          if (parsed) c1++;
        }
        while (f1)
        {
          int g1 = context.index;
          ArrayList<ParserAlternative> as2 = new ArrayList<ParserAlternative>();
          parsed = false;
          {
            int s2 = context.index;
            ParserAlternative a2 = new ParserAlternative(s2);
            parsed = true;
            if (parsed)
            {
              boolean f2 = true;
              int c2 = 0;
              for (int i2 = 0; i2 < 1 && f2; i2++)
              {
                Rule rule = Terminal_NumericValue.parse(context, "%x21-3A", "[\\x21-\\x3A]", 1);
                if ((f2 = rule != null))
                {
                  a2.add(rule, context.index);
                  c2++;
                }
              }
              parsed = c2 == 1;
            }
            if (parsed)
            {
              as2.add(a2);
            }
            context.index = s2;
          }
          {
            int s2 = context.index;
            ParserAlternative a2 = new ParserAlternative(s2);
            parsed = true;
            if (parsed)
            {
              boolean f2 = true;
              int c2 = 0;
              for (int i2 = 0; i2 < 1 && f2; i2++)
              {
                Rule rule = Terminal_NumericValue.parse(context, "%x3C-7E", "[\\x3C-\\x7E]", 1);
                if ((f2 = rule != null))
                {
                  a2.add(rule, context.index);
                  c2++;
                }
              }
              parsed = c2 == 1;
            }
            if (parsed)
            {
              as2.add(a2);
            }
            context.index = s2;
          }

          ParserAlternative b = ParserAlternative.getBest(as2);

          parsed = b != null;

          if (parsed)
          {
            a1.add(b.rules, b.end);
            context.index = b.end;
          }

          f1 = context.index > g1;
          if (parsed) c1++;
        }
        parsed = c1 >= 1;
      }
      if (parsed)
      {
        as1.add(a1);
      }
      context.index = s1;
    }

    ParserAlternative b = ParserAlternative.getBest(as1);

    parsed = b != null;

    if (parsed)
    {
      a0.add(b.rules, b.end);
      context.index = b.end;
    }

    Rule rule = null;
    if (parsed)
    {
        rule = new Rule_key_info(context.text.substring(a0.start, a0.end), a0.rules);
    }
    else
    {
        context.index = s0;
    }

    context.pop("key-info", parsed);

    return (Rule_key_info)rule;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
