import React from 'react';
import { TextInput } from './TextInput';
import { CharacterCount } from './CharacterCount';

export function CharacterCounter() {
  return (
    <div>
      <TextInput />
      <CharacterCount />
    </div>
  );
}
