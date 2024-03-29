/*
 * Copyright © 2020 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.oxicoco.errors;

/**
 * The set of IRC error codes.
 */

public enum OxIRCErrorCode
{
  /**
   * ERR_NOSUCHNICK
   */

  ERR_NOSUCHNICK(401),

  /**
   * ERR_NOSUCHSERVER
   */

  ERR_NOSUCHSERVER(402),

  /**
   * ERR_NOSUCHCHANNEL
   */

  ERR_NOSUCHCHANNEL(403),

  /**
   * ERR_CANNOTSENDTOCHAN
   */

  ERR_CANNOTSENDTOCHAN(404),

  /**
   * ERR_TOOMANYCHANNELS
   */

  ERR_TOOMANYCHANNELS(405),

  /**
   * ERR_WASNOSUCHNICK
   */

  ERR_WASNOSUCHNICK(406),

  /**
   * ERR_TOOMANYTARGETS
   */

  ERR_TOOMANYTARGETS(407),

  /**
   * ERR_NOORIGIN
   */

  ERR_NOORIGIN(409),

  /**
   * ERR_NORECIPIENT
   */

  ERR_NORECIPIENT(411),

  /**
   * ERR_NOTEXTTOSEND
   */

  ERR_NOTEXTTOSEND(412),

  /**
   * ERR_NOTOPLEVEL
   */

  ERR_NOTOPLEVEL(413),

  /**
   * ERR_WILDTOPLEVEL
   */

  ERR_WILDTOPLEVEL(414),

  /**
   * ERR_UNKNOWNCOMMAND
   */

  ERR_UNKNOWNCOMMAND(421),

  /**
   * ERR_NOMOTD
   */

  ERR_NOMOTD(422),

  /**
   * ERR_NOADMININFO
   */

  ERR_NOADMININFO(423),

  /**
   * ERR_FILEERROR
   */

  ERR_FILEERROR(424),

  /**
   * ERR_NONICKNAMEGIVEN
   */

  ERR_NONICKNAMEGIVEN(431),

  /**
   * ERR_ERRONEUSNICKNAME
   */

  ERR_ERRONEUSNICKNAME(432),

  /**
   * ERR_NICKNAMEINUSE
   */

  ERR_NICKNAMEINUSE(433),

  /**
   * ERR_NICKCOLLISION
   */

  ERR_NICKCOLLISION(436),

  /**
   * ERR_USERNOTINCHANNEL
   */

  ERR_USERNOTINCHANNEL(441),

  /**
   * ERR_NOTONCHANNEL
   */

  ERR_NOTONCHANNEL(442),

  /**
   * ERR_USERONCHANNEL
   */

  ERR_USERONCHANNEL(443),

  /**
   * ERR_NOLOGIN
   */

  ERR_NOLOGIN(444),

  /**
   * ERR_SUMMONDISABLED
   */

  ERR_SUMMONDISABLED(445),

  /**
   * ERR_USERSDISABLED
   */

  ERR_USERSDISABLED(446),

  /**
   * ERR_NOTREGISTERED
   */

  ERR_NOTREGISTERED(451),

  /**
   * ERR_NEEDMOREPARAMS
   */

  ERR_NEEDMOREPARAMS(461),

  /**
   * ERR_ALREADYREGISTRED
   */

  ERR_ALREADYREGISTRED(462),

  /**
   * ERR_NOPERMFORHOST
   */

  ERR_NOPERMFORHOST(463),

  /**
   * ERR_PASSWDMISMATCH
   */

  ERR_PASSWDMISMATCH(464),

  /**
   * ERR_YOUREBANNEDCREEP
   */

  ERR_YOUREBANNEDCREEP(465),

  /**
   * ERR_KEYSET
   */

  ERR_KEYSET(467),

  /**
   * ERR_CHANNELISFULL
   */

  ERR_CHANNELISFULL(471),

  /**
   * ERR_UNKNOWNMODE
   */

  ERR_UNKNOWNMODE(472),

  /**
   * ERR_INVITEONLYCHAN
   */

  ERR_INVITEONLYCHAN(473),

  /**
   * ERR_BANNEDFROMCHAN
   */

  ERR_BANNEDFROMCHAN(474),

  /**
   * ERR_BADCHANNELKEY
   */

  ERR_BADCHANNELKEY(475),

  /**
   * ERR_NOPRIVILEGES
   */

  ERR_NOPRIVILEGES(481),

  /**
   * ERR_CHANOPRIVSNEEDED
   */

  ERR_CHANOPRIVSNEEDED(482),

  /**
   * ERR_CANTKILLSERVER
   */

  ERR_CANTKILLSERVER(483),

  /**
   * ERR_NOOPERHOST
   */

  ERR_NOOPERHOST(491),

  /**
   * ERR_UMODEUNKNOWNFLAG
   */

  ERR_UMODEUNKNOWNFLAG(501),

  /**
   * ERR_USERSDONTMATCH
   */

  ERR_USERSDONTMATCH(502),

  /**
   * Extension: Invalid username
   */

  ERR_ERRONEUSUSERNAME(400),

  /**
   * Extension: Invalid channel name
   */

  ERR_ERRONEUSCHANNELNAME(400),

  /**
   * Extension: Invalid topic
   */

  ERR_ERRONEUSTOPIC(400);

  private final int code;

  OxIRCErrorCode(final int inCode)
  {
    this.code = inCode;
  }

  /**
   * @return The integer error code
   */

  public int code()
  {
    return this.code;
  }
}
