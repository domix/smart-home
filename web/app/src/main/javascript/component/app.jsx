import lights from './lights.js'
import React from 'react';
import ReactDOM from 'react-dom';
import Button from '@material-ui/core/Button';

function App() {
    // just for testing now
    lights.on();
    return (
        <Button variant="contained" color="primary">
            Smart Home
        </Button>
    );
}

ReactDOM.render(<App />, document.querySelector('#app'));