/**
 * MIT License
 *
 * Bot Character Framework - Java framework for building smart bots
 * Copyright (c) 2017 Dmitry Berezovsky https://github.com/corvis/bot-character-framework
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */
package org.bcf.domain;

import java.io.Serializable;

/**
 * Represents an entity participating in conversation.
 * It might be a person, group\room or bot
 *
 * @author Dmitry Berezovsky (corvis)
 */
public interface ConversationParticipant extends Serializable {
    String getId();

    String getName();

    String getMentionName();

    boolean isGroup();

    boolean isRobot();
}
